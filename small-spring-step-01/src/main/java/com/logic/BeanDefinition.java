package com.logic;/**
* @description Bean对象定义
* @author Logic
* @date 2023/6/17 16:32
* @version 1.0
*/
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
