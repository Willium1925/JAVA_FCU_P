package com.lee.lesson_sample.basic;

import java.util.Arrays;

public class Chech_0606_CountOdd {
    public static void main(String[] args) {
        // 指定範圍內所有基數總和，用while
        oddTest();
    }

    static void oddTest() {
        int min = 0;
        int max = 100;
        int sum = 0;
        int oddCount = 0;
        for (int i = min; i <= max; i++){
            if (i % 2 == 1) {
                //System.out.println(i);
                sum = sum + i;
                oddCount++;
            }
        }
        int[] odds = new int[oddCount];
        //{1, 3, 5, 7, 9} 基數
        //{0, 1, 2, 3, 4} 索引值
        for (int i = min; i <= max; i++){
            if (i % 2 == 1) {
                odds[(i-1)/2] = i;
            }
        }
        System.out.println(min + "到" + max + "的所有基數為");
        System.out.println(Arrays.toString(odds));
        System.out.println("總共有" + oddCount + "個基數");
        System.out.println(min + "到" + max + "的所有基數總和為"+ sum);
    }
}
