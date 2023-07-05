package com.logic.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Logic
 * @version 1.0
 * @description 资源加载接口定义和实现
 * @date 2023/7/5 22:45
 */
public interface Resource {

    /**
     * @description 获取InputStream流的方法
     *
     * @return java.io.InputStream
     * @author Logic
     * @date 2023/7/5 22:46
    */
    InputStream getInputStream() throws IOException;
}
