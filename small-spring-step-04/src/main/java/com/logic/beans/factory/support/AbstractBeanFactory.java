package com.logic.beans.factory.support;

import com.logic.beans.BeanException;
import com.logic.beans.factory.BeanFactory;
import com.logic.beans.factory.config.BeanDefinition;

/**
* @description BeanDefinition注册表接口
* @author Logic
* @date 2023/6/21 16:49
* @version 1.0
*/
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeanException {
        return doGetBean(name,null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeanException {
        return doGetBean(name,args);
    }

    protected <T> T doGetBean(final String name,final Object[] args){
        Object bean = getSingleton(name);
        if(bean != null){
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name,beanDefinition,args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeanException;

    protected abstract Object createBean(String beanName,BeanDefinition beanDefinition,Object[] args) throws BeanException;
}
