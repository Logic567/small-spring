package com.logic.beans.factory.config;

import com.logic.beans.BeanException;
import com.logic.beans.factory.HierarchicalBeanFactory;

/**
 * @author Logic
 * @version 1.0
 * @description TODO
 * @date 2023/7/4 18:00
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    Object getBean(String name) throws BeanException;

    Object getBean(String name, Object... args) throws BeanException;

    <T> T getBean(String name, Class<T> requiredType) throws BeanException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
