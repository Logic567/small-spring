package com.logic.beans.factory.support;

import com.logic.beans.factory.config.BeanDefinition;

/**
 * @author Logic
 * @version 1.0
 * @description TODO
 * @date 2023/6/21 16:45
 */
public interface BeanDefinitionRegistry {

    /**
     * @description 向表中注册 BeanDefinition
     * @param beanName
     * @param beanDefinition
     * @return void
     * @author Logic
     * @date 2023/6/21 16:45
    */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
