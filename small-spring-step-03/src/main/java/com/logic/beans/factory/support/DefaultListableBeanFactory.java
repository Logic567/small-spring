package com.logic.beans.factory.support;

import com.logic.beans.BeanException;
import com.logic.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
* @description TODO
* @author Logic
* @date 2023/6/21 17:33
* @version 1.0
*/
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{

    private Map<String,BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeanException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null){
            throw new BeanException("No bean named '" + beanName + "' is defined");
        }
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName,beanDefinition);
    }
}
