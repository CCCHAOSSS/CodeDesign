package com.llm.codedesigntutorials;

import com.llm.codedesigntutorials.service.VideoUserService;

public class ApiTest {
    public static void main(String[] args) {
        VideoUserService videoUserService = new VideoUserService();
        videoUserService.serviceGrade("VIP");
        videoUserService.serviceGrade("访客");
        videoUserService.serviceGrade("普通");
    }
}
