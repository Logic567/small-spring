package com.logic.beans.factory;

import com.logic.beans.BeanException;
import com.logic.beans.factory.config.AutowireCapableBeanFactory;
import com.logic.beans.factory.config.BeanDefinition;
import com.logic.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author Logic
 * @version 1.0
 * @description 提供分析和修改Bean以及预先实例化的操作接口
 * @date 2023/7/4 18:10
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeanException;
}
