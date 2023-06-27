package com.logic.test;

import com.logic.beans.factory.config.BeanDefinition;
import com.logic.beans.factory.support.DefaultListableBeanFactory;
import com.logic.test.bean.UserService;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
* @description 除了bean工厂，注册bean、获取bean三个步骤，还额外增加一次对象的获取和调用。
* @author Logic
* @date 2023/6/21 16:27
* @version 1.0
*/
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        //1.初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService",beanDefinition);
        //3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService","Logic");
        userService.queryUserInfo();
    }

    //无构造函数
    @Test
    public void test_newInstance() throws IllegalAccessException,InstantiationException{
        UserService userService = UserService.class.newInstance();
        System.out.println(userService);
    }

    //有构造函数
    @Test
    public void test_constructor() throws Exception{
        Class<UserService> userServiceClass = UserService.class;
        Constructor<UserService> declaredConstructor = userServiceClass.getDeclaredConstructor(String.class);
        UserService userService = declaredConstructor.newInstance("Logic");
        System.out.println(userService);
    }

    //Cglib实例化
    @Test
    public void test_cglib(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        Object obj = enhancer.create(new Class[]{String.class}, new Object[]{"Logic"});
        System.out.println(obj);
    }
}
