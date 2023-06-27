package com.logic.beans.factory.config;

/**
 * @author Logic
 * @version 1.0
 * @description 单例注册
 * @date 2023/6/21 16:43
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
