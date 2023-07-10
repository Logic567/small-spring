package com.logic.context;

import com.logic.beans.BeanException;

/**
 * @author Logic
 * @version 1.0
 * @description ConfigurableApplicationContext 继承自 ApplicationContext，并提供了 refresh 这个核心方法。
 * @date 2023/7/9 22:09
 */
public interface ConfigurableApplicationContext extends ApplicationContext{

    /**
     * @description 刷新容器
     *
     * @return void
     * @author Logic
     * @date 2023/7/9 22:09
    */
    void refresh() throws BeanException;
}
