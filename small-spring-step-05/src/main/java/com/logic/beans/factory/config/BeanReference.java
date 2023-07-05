package com.logic.beans.factory.config;

/**
* @description Bean 的引用
* @author Logic
* @date 2023/6/27 15:05
* @version 1.0
*/
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
