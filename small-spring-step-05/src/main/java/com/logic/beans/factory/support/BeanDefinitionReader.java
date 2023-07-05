package com.logic.beans.factory.support;

import com.logic.beans.BeanException;
import com.logic.core.io.Resource;
import com.logic.core.io.ResourceLoader;

/**
 * @author Logic
 * @version 1.0
 * @description 对资源的具体使用，将配置信息注册到Spring容器中去
 * @date 2023/7/5 22:30
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeanException;

    void loadBeanDefinitions(Resource ... resources) throws BeanException;

    void loadBeanDefinitions(String location) throws BeanException;
}
