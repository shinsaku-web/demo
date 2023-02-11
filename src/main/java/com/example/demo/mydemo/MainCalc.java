package com.example.demo.mydemo;

import com.example.demo.service.CalcServiceImpl;

public class MainCalc {
    public static void main(String[] args) {
        CalcServiceImpl calc = new CalcServiceImpl();
        int result = calc.sumOf(1, 3);
        System.out.println(result);
    }
}
