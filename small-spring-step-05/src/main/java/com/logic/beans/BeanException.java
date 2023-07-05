package com.logic.beans;
/**
* @description TODO
* @author Logic
* @date 2023/7/4 17:48
* @version 1.0
*/
public class BeanException extends RuntimeException{

    public BeanException(String msg){
        super(msg);
    }

    public BeanException(String msg,Throwable cause){
        super(msg,cause);
    }
}
