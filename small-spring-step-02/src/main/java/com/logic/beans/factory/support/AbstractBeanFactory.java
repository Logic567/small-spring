package com.logic.beans.factory.support;

import com.logic.beans.BeansException;
import com.logic.beans.factory.BeanFactory;
import com.logic.beans.factory.config.BeanDefinition;

/**
* @description 抽象类定义模板方法。具备使用单例注册类方法
* @author Logic
* @date 2023/6/20 17:52
* @version 1.0
*/
public abstract class AbstractBeanFactory extends DefaultSingletonBeanFactory implements BeanFactory {

    /**
     * @description 实现了BeanFactory的getBean方法，若已有bean，直接返回，若没有，则创建bean，具体实现由继承此抽象类的类实现
     * @param name
     * @return java.lang.Object
     * @author Logic
     * @date 2023/6/20 18:01
    */
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null){
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name,beanDefinition);
    }

    //获取bean定义方法
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    //创建bean方法
    protected abstract Object createBean(String beanName,BeanDefinition beanDefinition) throws BeansException;
}
