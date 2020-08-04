package com.DesignPattern.InterpreterPattern.demo2;

/**
 * 抽象表达式角色
 */
public interface Expression {
    /**
     * 解释方法
     * @param context
     * @return
     */
    int interpreter(Context context);
}
