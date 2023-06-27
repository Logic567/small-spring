package com.logic.beans.factory.config;
/**
* @description 和上章一样
* @author Logic
* @date 2023/6/21 16:31
* @version 1.0
*/
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
