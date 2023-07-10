package com.logic.core.io;

/**
 * @author Logic
 * @version 1.0
 * @description 定义获取资源接口
 * @date 2023/7/5 23:04
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
