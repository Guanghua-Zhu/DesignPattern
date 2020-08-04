package com.DesignPattern.InterpreterPattern.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文角色
 */
public class Context {
    private Map<String, Integer> map = new HashMap<>();

    /**
     * 定义变量的值
     * @param varName
     * @param varValue
     */
    public void define(String varName, Integer varValue) {
        map.put(varName, varValue);
    }

    /**
     * 获取变量的值
     * @param varName
     * @return
     */
    public int getVarValue(String varName) {
        return map.get(varName);
    }
}
