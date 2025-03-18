package com.lee.self_practice.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Array00 {
    public static void main(String[] args) {
        basicTest();
        //basicTest02();
        //basicTest03();
    }

    static void basicTest() {
        // 宣告後再給值，常搭配for迴圈使用
        int[] score = new int[5];
        System.out.println("整數陣列score[]的長度為" + score.length);
        for (int i = 0; i <score.length; i++) {
            score[i] = i+7;
            System.out.println("score[" + i + "]的值為" +score[i]);
        }

        // 宣告的同時給值
        int[] score02 = new int[]{33, 66, 99};
        for (int i = 0; i < score02.length; i++) {
            System.out.println(score02[i]);
        }
        // 更簡潔的寫法for-each
        for (int i : score02) {
            System.out.println(i);
        }

        // for-each只能讀取元素(照著本體抄一份副本，可以拿來改變他人，但無法改變正本)，無法修改內容
        // i 是「每個元素的複製值」，不是對應到陣列內的真正位置
        int[] num = new int[]{10, 20, 30, 40, 50};
        System.out.println("origin:" + Arrays.toString(num));
        for (int n: num) {
            //n=n+1; //這樣是沒用的
            for (int i = 0; i <num.length; i++) {
                if (num[i] == n) {
                    num[i]++;
                }
            }
        }
        System.out.println("plus one:" + Arrays.toString(num));
    }


    static void basicTest02() {
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

    static void basicTest03() {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入學生人數");
        int stuNum = sc.nextInt();
        int[] score = new int[stuNum];

        for (int i: score) {
            System.out.println("請輸入第"+ i +"位學生成績:");
            i = sc.nextInt();
        }
        int sum = 0;
        for (int i: score) {
            sum = sum + i;
        }
        System.out.println(stuNum + "位學生的平均成績為" + (sum/stuNum));
    }
}
