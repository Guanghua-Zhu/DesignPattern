package com.DesignPattern.InterpreterPattern.demo2;

/**
 * 基于后缀(逆波兰)表达式的四则运算(加、减、乘、除法)的 Interpreter Pattern 解释器模式Demo
 */
public class Demo2 {
    public static void main(String[] args) {
        // 定义上下文，即定义变量的值
        Context context = new Context();
        context.define("a",8);
        context.define("b",1);
        context.define("c",2);
        context.define("d",4);
        context.define("e",5);

        // 计算中缀表达式 b - a + e * d / c 值，即计算后缀(逆波兰)表达式 a b c d e * / + - 结果
        String str = "a b c d e * / + -";

        // 构建AST抽象语法树
        Expression expression = ASTUtil.build(str);
        Integer result =  expression.interpreter(context);
        System.out.println("期望值: 3 实际值: " + result);
    }
}
