package com.logic.context;

import com.logic.beans.factory.ListableBeanFactory;

/**
 * @author Logic
 * @version 1.0
 * @description ApplicationContext，继承于 ListableBeanFactory，也就继承了关于 BeanFactory 方法，比如一些 getBean 的方法。
 * 另外 ApplicationContext 本身是 Central 接口，但目前还不需要添加一些获取ID和父类上下文，所以暂时没有接口方法的定义。
 * @date 2023/7/9 22:07
 */
public interface ApplicationContext extends ListableBeanFactory {
}
