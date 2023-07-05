package com.logic.beans.factory.config;

import com.logic.beans.factory.HierarchicalBeanFactory;

/**
 * @author Logic
 * @version 1.0
 * @description TODO
 * @date 2023/7/4 18:00
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";
}
