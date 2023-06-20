package com.logic.beans.factory.config;

/**
* @description 把上一章中的Object bean替换为 Class，这样就可以把Bean 的实例化操作放到容器中处理了。上一章的Bean 的实例化操作是放在初始化调用阶段传递给
 * BeanDefinition 构造函数的。
* @author Logic
* @date 2023/6/20 17:41
* @version 1.0
*/
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass){
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
