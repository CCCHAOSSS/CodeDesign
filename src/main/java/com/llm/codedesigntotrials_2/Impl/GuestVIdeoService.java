package com.llm.codedesigntotrials_2.Impl;

import com.llm.codedesigntotrials_2.IVideoService;

/**
 * 访客（未登录）用户
 * */
public class GuestVIdeoService implements IVideoService {


    @Override
    public void definition() {
        System.out.println("访客用户，视频360p");
    }

    @Override
    public void advertisement() {
        System.out.println("访客用户，光浩90s");
    }
}
