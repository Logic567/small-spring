package com.logic.beans.factory.config;

import com.logic.beans.BeanException;

/**
 * @author Logic
 * @version 1.0
 * @description TODO
 * @date 2023/7/9 21:57
 */
public interface BeanPostProcessor {

    /**
     * @description 在 Bean 对象执行初始化方法之前，执行此方法
     * @param bean
     * @param beanName
     * @return java.lang.Object
     * @author Logic
     * @date 2023/7/9 21:58
    */
    Object postProcessBeforeInitialization(Object bean,String beanName) throws BeanException;

    /**
     * @description 在 Bean 对象执行初始化方法之后，执行此方法
     * @param bean
     * @param beanName
     * @return java.lang.Object
     * @author Logic
     * @date 2023/7/9 21:59
    */
    Object postProcessAfterInitialization(Object bean,String beanName) throws BeanException;
}
