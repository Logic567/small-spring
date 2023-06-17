package com.logic.test;

import com.logic.BeanDefinition;
import com.logic.BeanFactory;
import com.logic.test.bean.UserService;
import org.junit.Test;

/**
* @description TODO
* @author Logic
* @date 2023/6/17 16:32
* @version 1.0
*/
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        //1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        //2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        //3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
