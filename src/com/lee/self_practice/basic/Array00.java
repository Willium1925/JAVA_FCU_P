package com.lee.self_practice.basic;

import java.util.Scanner;

public class Array00 {
    public static void main(String[] args) {
//        // 宣告後再給值，常搭配for迴圈使用
//        int[] score = new int[5];
//        System.out.println("整數陣列score[]的長度為" + score.length);
//        for (int i = 0; i <score.length; i++) {
//            score[i] = i+7;
//            System.out.println("score[" + i + "]的值為" +score[i]);
//        }
//
//        // 宣告的同時給值
//        int[] score02 = new int[] {33,66,99};
//        for (int i = 0; i < score02.length; i++) {
//            System.out.println(score02[i]);
//        }

        // 輸入學生數，以及每個學生的成績，計算平均分數
        System.out.println("請輸入學生人數");
        Scanner sc = new Scanner(System.in);
        int stuNum = sc.nextInt();
        int[] stuScore = new int[stuNum];
        for (int i = 0; i <stuNum; i++) { // 也可以直接stuScore..length，這是一個屬性，不是方法，.length()才是方法
            System.out.println("請輸入第"+ (i+1) + "個學生的成績");
            Scanner sc01 = new Scanner(System.in);
            stuScore[i] = sc01.nextInt();
            sc01.nextLine();
        }

        int totalScore = 0;
        for (int i = 0; i < stuNum; i++) {
            totalScore = totalScore + stuScore[i];
        }

        System.out.println(stuNum + "位學生平均成績為" + totalScore/stuNum);
    }
}
