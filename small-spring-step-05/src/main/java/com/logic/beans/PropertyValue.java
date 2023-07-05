package com.logic.beans;
/**
* @description bean 属性信息
* @author Logic
* @date 2023/6/27 14:54
* @version 1.0
*/
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
