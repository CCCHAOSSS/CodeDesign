package com.llm.codedesigntutorials.service;

public class VideoUserService {
    public void serviceGrade(String userType){
        if("VIP".equals(userType)){
            System.out.println("vip用户");
        }else if ("普通".equals(userType)){
            System.out.println("普通用户");
        }else if ("访客".equals(userType)){
            System.out.println("访客用户");
        }
    }
}
