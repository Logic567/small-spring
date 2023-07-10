package com.logic.test.common;

import com.logic.beans.BeanException;
import com.logic.beans.PropertyValue;
import com.logic.beans.PropertyValues;
import com.logic.beans.factory.ConfigurableListableBeanFactory;
import com.logic.beans.factory.config.BeanDefinition;
import com.logic.beans.factory.config.BeanFactoryPostProcessor;

/**
* @description TODO
* @author Logic
* @date 2023/7/10 17:02
* @version 1.0
*/
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeanException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("company","改为：字节跳动"));
    }
}
