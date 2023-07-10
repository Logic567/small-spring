package com.logic.beans.factory.config;

import com.logic.beans.BeanException;
import com.logic.beans.factory.BeanFactory;

/**
 * @author Logic
 * @version 1.0
 * @description 自动化处理Bean工厂配置的接口
 * @date 2023/7/4 18:04
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    /**
     * @description 执行 BeanPostProcessors 接口实现类的 postProcessBeforeInitialization 方法
     * @param existingBean
     * @param beanName
     * @return java.lang.Object
     * @author Logic
     * @date 2023/7/10 16:07
    */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean,String beanName) throws BeanException;

    /**
     * @description 执行 BeanPostProcessors 接口实现类的 postProcessorsAfterInitialization 方法
     * @param existingBean
     * @param beanName
     * @return java.lang.Object
     * @author Logic
     * @date 2023/7/10 16:08
    */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean,String beanName) throws BeanException;
}
