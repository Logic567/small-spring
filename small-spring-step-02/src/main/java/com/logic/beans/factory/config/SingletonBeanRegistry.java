package com.logic.beans.factory.config;

/**
 * @author Logic
 * @version 1.0
 * @description 获取单例对象的接口
 * @date 2023/6/20 17:45
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
