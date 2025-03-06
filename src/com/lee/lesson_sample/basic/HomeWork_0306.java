package com.lee.lesson_sample.basic;

import java.util.Scanner;

public class HomeWork_0306 {
    public static void main(String[] args) {

        //calculator();
        //calculator02();
        standardWeight();

    }

    static void calculator() {
        System.out.println("四則運算啟動，可以輸入兩個數字並指定運算");
        Scanner sc = new Scanner(System.in);

        System.out.println("請輸入第一個數字");
        double a = sc.nextDouble();

        System.out.println("請選擇運算（加減乘除）");
        String symbol = sc.next(); // 為何不適用nextLine()

        System.out.println("請輸入第二個數字");
        //double b = sc.nextDouble();
        String bString = sc.next();

        double ans = 0;

        switch (symbol) {
            case "加", "+":
                ans = a + Double.parseDouble(bString);
                System.out.println(a + " + " + Double.parseDouble(bString) + " = " + ans);
                break;
            case "減", "-":
                ans = a - Double.parseDouble(bString);
                System.out.println(a + " - " + Double.parseDouble(bString) + " = " + ans);
                break;
            case "乘", "*", "x", "X":
                ans = a*Double.parseDouble(bString);
                System.out.println(a + " x " + Double.parseDouble(bString) + " = " + ans);
                break;
            case "除", "÷", "/":
                if (bString.equals("0")) {
                    System.out.println("除法中分母為零是無意義的");
                } else {
                    ans = a/Double.parseDouble(bString);
                    System.out.println( a + " ÷ " + Double.parseDouble(bString) + " = " + ans );
                }
                break;
            default:
                System.out.println("請輸入正確算數要求");
        }
        sc.close();
    }

    static void calculator02() {
        // 修正b不可為零

        System.out.println("四則運算啟動，可以輸入兩個數字並指定運算");
        Scanner sc = new Scanner(System.in);

        System.out.println("請輸入第一個數字");
        double a = sc.nextDouble();

        System.out.println("請選擇運算（加減乘除）");
        String symbol = sc.next(); // 為何不適用nextLine()

        System.out.println("請輸入第二個數字");
        double b = sc.nextDouble();
        if (symbol.equals("除") || symbol.equals("÷") || symbol.equals("/")) {
            while ((String.valueOf(b)).equals("0")) {
                System.out.println("您輸入的第二個數字" + b + "是零");
                System.out.println("分母不可為零，請重新輸入第二個數字");
                b = sc.nextDouble();
            }
        }
        double ans = 0;
        switch (symbol) {
            case "加", "+":
                ans = a + b;
                System.out.println(a + " + " + b + " = " + ans);
                break;
            case "減", "-":
                ans = a - b;
                System.out.println(a + " - " + b + " = " + ans);
                break;
            case "乘", "*", "x", "X":
                ans = a*b;
                System.out.println(a + " x " + b + " = " + ans);
                break;
            case "除", "÷", "/":
                ans = a/b;
                System.out.println(a + " ÷ " + b + " = " + ans);
                break;
            default:
                System.out.println("請輸入正確算數要求");
        }
        sc.close();
    }


    static void standardWeight() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("將計算標準體重，請輸入性別（男、女）");
            String userGender = sc.next();
            if (!userGender.equals("男") & !userGender.equals("女")) {
                System.out.println("非常抱歉，請正確輸入生理性別");
                continue;
            }

            System.out.println("請輸入身高");
            double height = sc.nextDouble();

            double stdWeightB = (height - 80)*0.7;
            double stdWeightG = (height - 70)*0.6;

            System.out.println(userGender.equals("男")? stdWeightB: stdWeightG);

        }
    }

}
