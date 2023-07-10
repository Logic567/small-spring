package com.logic.test.common;

import com.logic.beans.BeanException;
import com.logic.beans.factory.config.BeanPostProcessor;
import com.logic.test.bean.UserService;

/**
* @description TODO
* @author Logic
* @date 2023/7/10 17:05
* @version 1.0
*/
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeanException {
        if ("userService".equals(beanName)){
            UserService userService = (UserService) bean;
            userService.setLocation("改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeanException {
        return bean;
    }
}
