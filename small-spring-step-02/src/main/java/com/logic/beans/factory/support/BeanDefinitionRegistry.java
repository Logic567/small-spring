package com.logic.beans.factory.support;

import com.logic.beans.factory.config.BeanDefinition;

/**
 * @author Logic
 * @version 1.0
 * @description 向注册表中注册 BeanDefinition
 * @date 2023/6/20 18:12
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
