package com.logic.beans.factory.support;

import com.logic.beans.BeanException;
import com.logic.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author Logic
 * @version 1.0
 * @description 定义实例化策略接口
 * @date 2023/6/21 17:07
 */
public interface InstantiationStrategy {

    /**
     * @description TODO
     * @param beanDefinition
     * @param name
     * @param ctor 包含一些必要的类信息，目的是为了拿到符合入参信息相对应的构造函数
     * @param args 具体的入参信息
     * @return java.lang.Object
     * @author Logic
     * @date 2023/6/21 17:08
    */
    Object instantiate(BeanDefinition beanDefinition, String name, Constructor ctor,Object[] args) throws BeanException;
}
