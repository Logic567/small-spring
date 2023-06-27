package com.logic.beans.factory.support;

import cn.hutool.core.bean.BeanUtil;
import com.logic.beans.BeanException;
import com.logic.beans.PropertyValue;
import com.logic.beans.PropertyValues;
import com.logic.beans.factory.config.BeanDefinition;
import com.logic.beans.factory.config.BeanReference;

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
            //给bean填充属性
            applyPropertyValues(beanName,bean,beanDefinition);

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
        for (Constructor ctor : declaredConstructors) {
            if (null != args && ctor.getParameterTypes().length == args.length){
                constructorToUse = ctor;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition,beanName,constructorToUse,args);
    }

    /**
     * @description 属性填充
     * @param beanName
     * @param bean
     * @param beanDefinition
     * @return void
     * @author Logic
     * @date 2023/6/27 15:11
    */
    protected void applyPropertyValues(String beanName,Object bean,BeanDefinition beanDefinition){
        try {
            PropertyValues propertyValues = beanDefinition.getPropertyValues();
            for (PropertyValue propertyValue : propertyValues.getPropertyValues()) {
                String name = propertyValue.getName();
                Object value = propertyValue.getValue();

                if(value instanceof BeanReference){
                    //A依赖B，获取B的实例化
                    BeanReference beanReference = (BeanReference) value;
                    value = getBean(beanReference.getBeanName());
                }
                //属性填充
                BeanUtil.setFieldValue(bean,name,value);
            }
        }catch (Exception e){
            throw new BeanException("Error setting property values: " + beanName);
        }
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }
}
