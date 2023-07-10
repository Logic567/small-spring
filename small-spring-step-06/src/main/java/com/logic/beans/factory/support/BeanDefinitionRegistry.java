package com.logic.beans.factory.support;

import com.logic.beans.BeanException;
import com.logic.beans.factory.config.BeanDefinition;

/**
 * @author Logic
 * @version 1.0
 * @description TODO
 * @date 2023/7/5 21:59
 */
public interface BeanDefinitionRegistry {

    /**
     * @description 向注册表中注册 BeanDefinition
     * @param beanName
     * @param beanDefinition
     * @return void
     * @author Logic
     * @date 2023/7/5 22:00
    */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * @description 使用Bean名称查询BeanDefinition
     * @param beanName
     * @return com.logic.beans.factory.config.BeanDefinition
     * @author Logic
     * @date 2023/7/5 22:00
    */
    BeanDefinition getBeanDefinition(String beanName) throws BeanException;

    /**
     * @description 判断是否包含指定名称的BeanDefinition
     * @param beanName
     * @return boolean
     * @author Logic
     * @date 2023/7/5 22:02
    */
    boolean containsBeanDefinition(String beanName);

    /**
     * @description 返回注册表中所有的bean名称
     *
     * @return java.lang.String[]
     * @author Logic
     * @date 2023/7/5 22:03
    */
    String[] getBeanDefinitionNames();
}
