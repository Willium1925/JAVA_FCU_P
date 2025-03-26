package com.lee.lesson_sample.final_test;

import java.util.Arrays;
import java.util.Scanner;

// 寫一個java 語言程式，使用者輸入10個，0-9的數字，
// 需要找出輸入中出現次數最多的數字，並顯示該數字及其出現的次數。
// 1 2 3 3 3 4 5 6 6 7   ---   3,3
//當使用者輸入超過10個整數時顯示"Out of range"
// {1, 2, 2, 2, 4} 實際數值
// [0  1  2  3  4] 索引值
// {0, 0, 0, 0, 0} 計數器
public class Problem02 {
    public static void main(String[] args) {
        test02();
    }

    static void test01() {
        int[] intArray = new int[10];
        int[] countArray = intArray.clone(); // 索引值即可代表0-9，紀錄0-9的出現次數
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < intArray.length; i++) {
            int temp = sc.nextInt();
            if (temp > 9 || temp < 0) {
                System.out.println("Out of range");
                i--;
            } else {
                intArray[i] = temp;
            }
        }
        System.out.println(Arrays.toString(intArray));
        for (int i = 0; i < countArray.length; i++) {
            for (int a: intArray) {
                if (a == i ) {
                    countArray[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(countArray));
        int maxCountNum = 0;
        int maxCount = 0;
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] > maxCount) {
                maxCount = countArray[i];
                maxCountNum = i;
            }
        }
        System.out.println(maxCountNum + "," + maxCount);
    }

    // 繳交版
    static void test02() {
        int[] intArray = new int[10];
        int[] countArray = intArray.clone();
        Scanner sc = new Scanner(System.in);
        boolean isOut = false;
        int count = 0;
        for (int i = 0; i < intArray.length; i++) {
            int temp = sc.nextInt();
            count ++;
            if (count > 10) {
                break;
            }
            if (temp > 9 || temp < 0) {
                isOut = true;
                break;
            }
            intArray[i] = temp;
        }
        if (isOut) {
            System.out.println("Out of range");
        } else {
            for (int i = 0; i < countArray.length; i++) {
                for (int a: intArray) {
                    if (a == i ) {
                        countArray[i]++;
                    }
                }
            }
            int maxCountNum = 0;
            int maxCount = 0;
            for (int i = 0; i < countArray.length; i++) {
                if (countArray[i] > maxCount) {
                    maxCount = countArray[i];
                    maxCountNum = i;
                }
            }
            System.out.println(maxCountNum + "," + maxCount);
        }
    }
}
