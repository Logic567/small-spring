package com.logic.test;

import cn.hutool.core.io.IoUtil;
import com.logic.beans.PropertyValue;
import com.logic.beans.PropertyValues;
import com.logic.beans.factory.config.BeanDefinition;
import com.logic.beans.factory.config.BeanReference;
import com.logic.beans.factory.support.DefaultListableBeanFactory;
import com.logic.beans.factory.xml.XmlBeanDefinitionReader;
import com.logic.context.support.ClassPathXmlApplicationContext;
import com.logic.core.io.DefaultResourceLoader;
import com.logic.core.io.Resource;
import com.logic.test.bean.UserDao;
import com.logic.test.bean.UserService;
import com.logic.test.common.MyBeanFactoryPostProcessor;
import com.logic.test.common.MyBeanPostProcessor;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
* @description TODO
* @author Logic
* @date 2023/7/5 23:49
* @version 1.0
*/
public class ApiTest {

    @Test
    public void test_BeanFactoryPostProcessorAndBeanPostProcessor(){
        //1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //2.读取配置文件&注册Bean
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");
        //3.BeanDefinition 加载完成 & Bean实例化之前，修改 BeanDefinition 的属性值
        MyBeanFactoryPostProcessor beanFactoryPostProcessor = new MyBeanFactoryPostProcessor();
        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);
        //4.Bean实例化之后，修改 Bean 属性信息
        MyBeanPostProcessor beanPostProcessor = new MyBeanPostProcessor();
        beanFactory.addBeanPostProcessor(beanPostProcessor);
        //5.获取Bean对象调用方法
        UserService userService = beanFactory.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }

    @Test
    public void test_xml(){
        //1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springPostProcessor.xml");
        //2.获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }
}
