package com.llm.codedesigntotrials_2.Impl;

import com.llm.codedesigntotrials_2.IVideoService;

/**
 * 普通用户
 * */
public class OrdinaryVideoService implements IVideoService {
    @Override
    public void definition() {
        System.out.println("普通用户，720p");
    }

    @Override
    public void advertisement() {
        System.out.println("普通用户广告30s");
    }
}
