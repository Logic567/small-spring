package com.logic;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
* @description Bean的注册和获取
* @author Logic
* @date 2023/6/17 16:32
* @version 1.0
*/
public class BeanFactory {

    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    //获取bean
    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    //将bean注入到map中
    public void registerBeanDefinition(String name,BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }
}
