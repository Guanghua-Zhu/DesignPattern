package com.DesignPattern.InterpreterPattern.demo2;

/**
 * 终止表达式角色：变量
 */
public class Variable implements Expression {

    /**
     * 变量名
     */
    private String varName;

    public Variable(String varName) {
        this.varName = varName;
    }

    /**
     * 语法规则解释: 从context上下文中获取变量的值
     * @param context
     * @return
     */
    @Override
    public int interpreter(Context context) {
        return context.getVarValue(varName);
    }
}
