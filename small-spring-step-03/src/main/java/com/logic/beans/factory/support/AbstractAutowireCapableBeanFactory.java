package com.logic.beans.factory.support;

import com.logic.beans.BeanException;
import com.logic.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
* @description 创建策略调用
* @author Logic
* @date 2023/6/21 17:18
* @version 1.0
*/
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    //选择Cglib实现类
    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeanException {
        Object bean = null;
        try {
            bean = createBeanInstance(beanDefinition,beanName,args);
        }catch (Exception e){
            throw new BeanException("Instantiation of bean failed",e);
        }
        addSingleton(beanName,bean);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition,String beanName,Object[] args){
        Constructor constructorToUse = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        //获取到所有的构造函数集合
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();

        //遍历构造函数，匹配args
        for (Constructor<?> ctor : declaredConstructors) {
            if (null != args && ctor.getParameterTypes().length == args.length){
                constructorToUse = ctor;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition,beanName,constructorToUse,args);
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }
}
