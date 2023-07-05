package com.logic.beans.factory.support;

import com.logic.beans.BeanException;
import com.logic.core.io.DefaultResourceLoader;
import com.logic.core.io.Resource;
import com.logic.core.io.ResourceLoader;

/**
* @description TODO
* @author Logic
* @date 2023/7/5 23:16
* @version 1.0
*/
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry){
        this(registry,new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
