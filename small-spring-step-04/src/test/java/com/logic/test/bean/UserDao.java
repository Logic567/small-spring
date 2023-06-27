package com.logic.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
* @description TODO
* @author Logic
* @date 2023/6/27 15:16
* @version 1.0
*/
public class UserDao {

    private static Map<String,String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001","小富");
        hashMap.put("10002","罗辑");
        hashMap.put("10003","大史");
    }

    public String queryUserName(String uId){
        return hashMap.get(uId);
    }
}
