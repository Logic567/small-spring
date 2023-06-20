package com.logic.test;

import com.logic.beans.factory.config.BeanDefinition;
import com.logic.beans.factory.support.DefaultListableBeanFactory;
import com.logic.test.bean.UserService;
import org.junit.Test;

/**
* @description 在此次的单元测试中除了包括；Bean 工厂、注册Bean、获取Bean，三个步骤，还额外增加了一次对象的获取和调用。这里主要测试验证单例对象的是否正确的存放到了缓存中。
 * 此外与上一章节测试过程中不同的是，我们把UserService.class 传递给了
 * BeanDefinition 而不是像上一章节那样直接new UserService() 操作。
* @author Logic
* @date 2023/6/20 18:22
* @version 1.0
*/
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        //1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService",beanDefinition);
        //3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        //4.第二次获取bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }
}
