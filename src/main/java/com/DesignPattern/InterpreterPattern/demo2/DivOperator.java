package com.DesignPattern.InterpreterPattern.demo2;

/**
 * 非终止表达式角色：除法操作符
 */
public class DivOperator implements Expression {
    /**
     * 第一个操作数
     */
    private Expression num1;

    /**
     * 第二个操作数
     */
    private Expression num2;

    public DivOperator(Expression num1, Expression num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * 语法规则解释: 除法
     * @param context
     * @return
     */
    @Override
    public int interpreter(Context context) {
        int result = num1.interpreter(context) / num2.interpreter(context);
        return result;
    }
}
