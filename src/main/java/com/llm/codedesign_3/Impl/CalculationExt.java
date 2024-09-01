package com.llm.codedesign_3.Impl;

import com.llm.codedesign_3.ICalculation;
/**
 * 开闭职责
*   扩展类
* */
public class CalculationExt extends Calculation {

    private final static double pi = 3.14159D;

    @Override
    public double circular(double r) {
        return pi * r * r;
    }
}
