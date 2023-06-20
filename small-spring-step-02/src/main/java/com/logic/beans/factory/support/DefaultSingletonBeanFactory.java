package com.logic.beans.factory.support;

import com.logic.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
* @description 在DefaultSingletonBeanRegistry 中主要实现getSingleton 方法，同时实现了一个受保护的addSingleton 方法，这个方法可以被继承此类的其他类调用。包括：
 * AbstractBeanFactory 以及继承的DefaultListableBeanFactory 调用。
* @author Logic
* @date 2023/6/20 17:46
* @version 1.0
*/
public class DefaultSingletonBeanFactory implements SingletonBeanRegistry {

    //存放单例对象
    private Map<String,Object> singletonObjects = new HashMap<>();

    /**
     * @description 获取一个单例对象
     * @param beanName
     * @return java.lang.Object
     * @author Logic
     * @date 2023/6/20 17:49
    */
    @Override
    public Object getSingleton(String beanName) {
        //根据beanName取得map中的对象
        return singletonObjects.get(beanName);
    }

    /**
     * @description 添加单例对象
     * @param beanName
     * @param singletonObject
     * @return void
     * @author Logic
     * @date 2023/6/20 17:48
    */
    protected void addSingleton(String beanName,Object singletonObject){
        singletonObjects.put(beanName,singletonObject);
    }
}
