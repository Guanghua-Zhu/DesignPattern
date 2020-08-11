package com.DesignPattern.InterpreterPattern.demo1;

/**
 * 非终止符表达式角色：减法操作符
 */
public class SubOperator implements Expression {
    /**
     * 第一个操作数
     */
    private Expression num1;

    /**
     * 第二个操作数
     */
    private Expression num2;

    public SubOperator(Expression num1, Expression num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * 语法规则解释: 减法
     * @param context
     * @return
     */
    @Override
    public int interpreter(Context context) {
        int result = num1.interpreter(context) - num2.interpreter(context);
        return result;
    }
}
