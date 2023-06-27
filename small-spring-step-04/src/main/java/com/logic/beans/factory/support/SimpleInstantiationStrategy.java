package com.logic.beans.factory.support;

import com.logic.beans.BeanException;
import com.logic.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
* @description JDK实例化
* @author Logic
* @date 2023/6/21 17:09
* @version 1.0
*/
public class SimpleInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String name, Constructor ctor, Object[] args) throws BeanException {
        //通过 BeanDefinition 获取 Class 信息
        Class clazz = beanDefinition.getBeanClass();
        try {
            //ctor为空就是无构造函数实例化，不空就是有构造函数实例化
            if(null != ctor){
                return clazz.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
            }else {
                return clazz.getDeclaredConstructor().newInstance();
            }
        }catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e){
            throw new BeanException("Failed to instantiate [" + clazz.getName() + "]",e);
        }
    }
}
