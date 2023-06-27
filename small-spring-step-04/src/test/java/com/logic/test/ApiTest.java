package com.logic.test;

import com.logic.beans.PropertyValue;
import com.logic.beans.PropertyValues;
import com.logic.beans.factory.config.BeanDefinition;
import com.logic.beans.factory.config.BeanReference;
import com.logic.beans.factory.support.DefaultListableBeanFactory;
import com.logic.test.bean.UserDao;
import com.logic.test.bean.UserService;
import org.junit.Test;

/**
* @description 先把userDao注入到Bean容器中，然后填充属性，再正常获取userService对象，调用方法
* @author Logic
* @date 2023/6/27 15:20
* @version 1.0
*/
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        //1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //2.UserDao 注册
        beanFactory.registerBeanDefinition("userDao",new BeanDefinition(UserDao.class));
        //3.UserService 设置属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId","10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));
        //4.UserService 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class,propertyValues);
        beanFactory.registerBeanDefinition("userService",beanDefinition);
        //5.UserService 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
