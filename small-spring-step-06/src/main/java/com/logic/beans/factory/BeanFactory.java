package com.logic.beans.factory;

import com.logic.beans.BeanException;

/**
* @description Bean工厂接口，用于获取Bean对象
* @author Logic
* @date 2023/6/21 16:37
* @version 1.0
*/
public interface BeanFactory {

    Object getBean(String name) throws BeanException;

    /**
     * @description 重载了一个含有入参信息args的getBean方法，这样可以方便传递入参给构造函数实例化
     * @param name
     * @param args
     * @return java.lang.Object
     * @author Logic
     * @date 2023/6/21 17:05
    */
    Object getBean(String name,Object ... args) throws BeanException;

    /**
     * @description 新增按类型获取Bean的方法
     * @param name
     * @param requiredType
     * @return T
     * @author Logic
     * @date 2023/7/5 22:36
    */
    <T> T getBean(String name,Class<T> requiredType) throws BeanException;
}
