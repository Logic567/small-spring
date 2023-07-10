package com.logic.test.bean;/**
* @description TODO
* @author Logic
* @date 2023/7/5 23:43
* @version 1.0
*/
public class UserService {

    private String uId;
    private String company;
    private UserDao userDao;
    private String location;

    public String queryUserInfo(){
        return userDao.queryUserName(uId) + ",公司：" + company + ",地点" + location;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
