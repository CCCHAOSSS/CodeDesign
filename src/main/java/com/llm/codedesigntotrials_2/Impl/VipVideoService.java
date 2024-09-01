package com.llm.codedesigntotrials_2.Impl;

import com.llm.codedesigntotrials_2.IVideoService;


/**
 * vip
 * */
public class VipVideoService implements IVideoService {
    @Override
    public void definition() {
        System.out.println("vip用户1080p");
    }

    @Override
    public void advertisement() {
        System.out.println("vip用户无广告");
    }
}
