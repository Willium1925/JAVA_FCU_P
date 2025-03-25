package com.lee.lesson_sample.final_test;

import java.util.Scanner;

public class Problem01 {
    // 請設計一個程式，可利用陣列儲存資料。
    // 使用者會輸入10個整數。
    // 程式依數字所在的位置將這10個數字分為兩組：奇數位數和偶數位數，然後分別計算兩組數字的總和。
    // 最後，輸出這兩組數字的總和。
    //如：
    //arr[0]+arr[2]+arr[4]+arr[6]+arr[8]
    //arr[1]+arr[3]+arr[5]+arr[7]+arr[9]
    // 1 2 3 4 5 6 7 8 9 10   --   25,30
    public static void main(String[] args) {
        //test01();
        //test02();
        test03();
    }

    static void test01() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArray = str.trim().split("\\s+");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (i%2 == 0) {
                sumEven += intArray[i];
            } else {
                sumOdd += intArray[i];
            }
        }
        System.out.println(sumEven + "," + sumOdd);
    }

    static void test02() {
        int[] intArray = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (i%2 == 0) {
                sumEven += intArray[i];
            } else {
                sumOdd += intArray[i];
            }
        }
        System.out.println(sumEven + "," + sumOdd);
    }

    static void test03() {
        int[] intArray = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            if (sc.hasNext()) {
                intArray[i] = sc.nextInt();
            }
        }
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < 10; i++) {
            if (i%2 == 0) {
                sumEven += intArray[i];
            } else {
                sumOdd += intArray[i];
            }
        }
        System.out.println(sumEven + "," + sumOdd);
    }
}
