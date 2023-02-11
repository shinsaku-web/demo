package com.example.demo.service;

public class CalcServiceImpl implements CalcService {

    @Override
    public int sumOf(int x, int y) {
        int times = y - x;
        int sum = 0;
        if (times <= 0) {
            try {
                throw new Exception("yはxより大きくしてください。");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (int i = x; i < y + 1; i++) {
            sum = sum + i;
        }
        return sum;
    }

}
