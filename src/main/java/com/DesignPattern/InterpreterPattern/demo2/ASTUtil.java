package com.DesignPattern.InterpreterPattern.demo2;

import java.util.Stack;

/**
 * AST抽象语法树工具
 */
public class ASTUtil {
    /**
     * 构建AST抽象语法树
     * @param str
     * @return
     */
    public static Expression build(String str) {
        Stack<Expression> stack = new Stack<>();
        // 使用空格作为分隔符进行切分
        String[] strArray = str.split(" ");

        // 按从左到右的顺序依次扫描
        for( String element : strArray ) {
            switch (element) {
                case "+":   // 遇到操作符
                case "-":
                case "*":
                case "/":
                    // 1. 先从栈中弹出两个操作数
                    Expression num1 = stack.pop();  // 获取第一个操作数
                    Expression num2 = stack.pop();  // 获取第二个操作数
                    // 2. 构造结果表达式
                    Expression result = null;
                    switch (element) {
                        case "+":
                            result = new AddOperator(num1, num2);
                            break;
                        case "-":
                            result = new SubOperator(num1, num2);
                            break;
                        case "*":
                            result = new MulOperator(num1, num2);
                            break;
                        case "/":
                            result = new DivOperator(num1, num2);
                            break;
                    }
                    // 3. 将结果压入栈中
                    stack.push(result);
                    break;
                default:    // 遇到操作数
                    // 构造变量表达式, 直接入栈
                    Expression var = new Variable(element);
                    stack.push( var );
            }
        }
        return stack.pop();
    }
}
