package com.logic.beans.factory.support;

import com.logic.beans.BeansException;
import com.logic.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
* @description TODO
* @author Logic
* @date 2023/6/20 18:11
* @version 1.0
*/
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{

    private Map<String,BeanDefinition> beanDefinitionMap = new HashMap<>();

    /**
     * @description 获取bean定义
     * @param beanName
     * @return com.logic.beans.factory.config.BeanDefinition
     * @author Logic
     * @date 2023/6/20 18:18
    */
    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null){
            throw new BeansException("No bean named '" + beanName + "' is defined");
        }
        return beanDefinition;
    }

    /**
     * @description 注册bean定义
     * @param beanName
     * @param beanDefinition
     * @return void
     * @author Logic
     * @date 2023/6/20 18:18
    */
    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName,beanDefinition);
    }
}
