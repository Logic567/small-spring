package com.logic.beans.factory;

import com.logic.beans.BeansException;

/**
* @description bean工厂接口，只有一个获取bean方法
* @author Logic
* @date 2023/6/20 17:54
* @version 1.0
*/
public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
