package com.lee.lesson_sample.final_test;

import java.util.Arrays;
import java.util.Scanner;

// 寫一個java 語言程式，使用者輸入10個，0-9的數字，
// 需要找出輸入中出現次數最多的數字，並顯示該數字及其出現的次數。
// 1 2 3 3 3 4 5 6 6 7   ---   3,3
//當使用者輸入超過10個整數時顯示"Out of range"
public class Problem02 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int[] countArray = intArray.clone(); // 索引值即可代表0-9，紀錄0-9的出現次數
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int temp = sc.nextInt();
            if (temp > 9 || temp < 0) {
                System.out.println("Out of range");
            } else {
                intArray[i] = temp;
            }
        }
        for (int i: intArray) {
            for (int j: intArray) {
                if (j == i) {
                   countArray[i]++;
                }
            }
        }

        int maxCount = 0;
        int maxCountNum = 0;
        for (int c = 0; c < 9; c++) {
            if (countArray[c] > countArray[c+1]) {
                maxCount = countArray[c];
                maxCountNum = c;
            }
        }
        System.out.println(maxCountNum + "," + maxCount);

    }
}
