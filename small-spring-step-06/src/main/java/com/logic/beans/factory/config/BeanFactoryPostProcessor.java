package com.logic.beans.factory.config;

import com.logic.beans.BeanException;
import com.logic.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author Logic
 * @version 1.0
 * @description TODO
 * @date 2023/7/9 21:51
 */
public interface BeanFactoryPostProcessor {

    /**
     * @description 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     * @param beanFactory
     * @return void
     * @author Logic
     * @date 2023/7/9 21:56
    */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeanException;
}
