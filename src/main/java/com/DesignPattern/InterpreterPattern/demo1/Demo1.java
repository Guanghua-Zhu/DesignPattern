package com.DesignPattern.InterpreterPattern.demo1;

/**
 * 基于中缀表达式的加、减法的 Interpreter Pattern 解释器模式Demo
 */
public class Demo1 {
    public static void main(String[] args) {
        // 定义上下文，即定义变量的值
        Context context = new Context();
        context.define("a",3);
        context.define("b",5);
        context.define("c",7);

        Expression a = new Variable("a");
        Expression b = new Variable("b");
        Expression c = new Variable("c");

        System.out.println("------------ Test 1 ------------");
        // 计算表达式 a+b
        Expression aAddb = new AddOperator(a,b);
        Integer result1 = aAddb.interpreter(context);
        System.out.println("a+b = " + result1);

        System.out.println("------------ Test 2 ------------");
        // 计算表达式 a+b-c
        Expression aAddbSubc = new SubOperator( aAddb, c ); // client 客户端负责组装 AST抽象语法树
        Integer result2 = aAddbSubc.interpreter(context);
        System.out.println("a+b-c = " + result2);
    }
}
