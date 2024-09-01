package com.llm.codedesign_3.Impl;


import com.llm.codedesign_3.ICalculation;

/**
 * 计算图像面积
 * */
public class Calculation implements ICalculation {
    private final static double pi = 3.14D;

    public double rectangle(double x, double y) {
        return x * y;
    }

    public double triangle(double x, double y, double z) {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    public double circular(double r) {
        return pi * r * r;
    }
}
