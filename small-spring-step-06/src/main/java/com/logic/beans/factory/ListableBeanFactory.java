package com.logic.beans.factory;

import com.logic.beans.BeanException;

import java.util.Map;

/**
 * @author Logic
 * @version 1.0
 * @description 扩展Bean工厂接口的接口，新增两种方法
 * @date 2023/7/4 18:06
 */
public interface ListableBeanFactory extends BeanFactory{

    /**
     * @description 按照类型返回 Bean 实例
     * @param type
     * @return java.util.Map<java.lang.String,T>
     * @author Logic
     * @date 2023/7/4 18:08
    */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeanException;

    /**
     * @description 返回注册表中所有的Bean名称
     *
     * @return java.lang.String[]
     * @author Logic
     * @date 2023/7/4 18:08
    */
    String[] getBeanDefinitionNames();
}
