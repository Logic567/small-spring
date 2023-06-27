package com.logic.test.bean;/**
* @description TODO
* @author Logic
* @date 2023/6/21 16:27
* @version 1.0
*/
public class UserService {

    private String name;

    public UserService() {
    }

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo(){
        System.out.println("查询用户信息：" + name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("").append(name);
        return sb.toString();
    }
}
