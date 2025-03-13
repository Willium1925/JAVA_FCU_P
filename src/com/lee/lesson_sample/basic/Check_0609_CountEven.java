package com.lee.lesson_sample.basic;

public class Check_0609_CountEven {
    public static void main(String[] args) {
        // 計算指定範圍內的所有偶數和，用while
        evenTest();
    }

    static void evenTest() {
        int min = 0;
        int max = 10;
        int i = 0;
        int sum = 0;
        while (i <= max) {
            if (i%2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
        // 用continue也行，是另一種思考方式，但這裡不太需要
    }
}
