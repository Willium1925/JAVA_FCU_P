package com.lee.lesson_sample.basic;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int i = 3;
//        int j = 4;
//        i = 3+j+5+6;
//        j=i;
//        System.out.println("變數i的內容是" + i);
//        System.out.println("變數j的內容是" + j);
//        int i,j,k,l;
//        i=j=k=l=3+5;
//        System.out.println("i = " + i);
//        System.out.println("j = " + j);
//        System.out.println("k = " + k);
//        System.out.println("l = " + l);

        //ifTest();
        //ifTest02();
        testCheck();
    }

    static void ifTest() {
        int liter = 30;
        if ((liter >= 2) | (liter < 5)) {
            System.out.println("提醒");
        }
        System.out.println("愉快");
    }

    static void ifTest02() {
        System.out.println("請輸入成績");
        Scanner sca = new Scanner(System.in);
        int score = sca.nextInt();
        if (score<0 || score>100) {
            System.out.println("輸入錯誤");
        } else if (score>=90 /*& score<=100*/) {
            System.out.println(score + "分是A等");
        } else if (score>=80 /*& score<=89*/) {
            System.out.println(score + "分是B等");
        } else if (score>=70 /*& score<=79*/) {
            System.out.println(score + "分是C等");
        } else if (score>=60 /*& score<=69*/) {
            System.out.println(score + "分是D等");
        } else {
            System.out.println("不及格！");
        }
    }

    static void testCheck() {
        for (;;) {
            System.out.println("0");
        }
    }
}