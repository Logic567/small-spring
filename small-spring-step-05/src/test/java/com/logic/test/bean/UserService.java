package com.logic.test.bean;/**
* @description TODO
* @author Logic
* @date 2023/7/5 23:43
* @version 1.0
*/
public class UserService {

    private String uId;

    private UserDao userDao;

    public String queryUserInfo(){
        return userDao.queryUserName(uId);
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
