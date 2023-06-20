package com.logic.beans;
/**
* @description 定义bean异常
* @author Logic
* @date 2023/6/20 17:55
* @version 1.0
*/
public class BeansException extends RuntimeException{

    public BeansException(String msg){
        super(msg);
    }

    public BeansException(String msg,Throwable cause){
        super(msg,cause);
    }
}
