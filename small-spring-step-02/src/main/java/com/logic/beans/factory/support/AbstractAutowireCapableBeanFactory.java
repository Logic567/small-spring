package com.logic.beans.factory.support;

import com.logic.beans.BeansException;
import com.logic.beans.factory.config.BeanDefinition;

/**
* @description 实例化bean类。重写createBean方法
* @author Logic
* @date 2023/6/20 18:05
* @version 1.0
*/
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    /**
     * @description 首先实例化一个bean，然后调用addSingleton方法存放到单例对象的缓存中去
     * @param beanName
     * @param beanDefinition
     * @return java.lang.Object
     * @author Logic
     * @date 2023/6/20 18:09
    */
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        }catch (InstantiationException | IllegalAccessException e){
            throw new BeansException("Instantiation of bean failed",e);
        }

        addSingleton(beanName,bean);
        return bean;
    }
}
