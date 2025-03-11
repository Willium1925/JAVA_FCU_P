package com.lee.lesson_sample.basic;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class HomeWork_0306 {
    public static void main(String[] args) {

        //calculator();
        //calculator02();
        //standardWeight();
        standardWeight_useBigDecimal();

    }

    static void calculator() {
        System.out.println("四則運算啟動，可以輸入兩個數字並指定運算");
        Scanner sc = new Scanner(System.in);

        System.out.println("請輸入第一個數字");
        double a = sc.nextDouble();
        BigDecimal bigA = new BigDecimal(String.valueOf(a));

        System.out.println("請選擇運算（加減乘除）");
        String symbol = sc.next(); // 為何不適用nextLine()

        System.out.println("請輸入第二個數字");
        //double b = sc.nextDouble();
        String bString = sc.next();
        BigDecimal bigB = new BigDecimal(bString);

        double ans = 0;
        //BigDecimal bigAns = new BigDecimal("0"); // BigDecimal要使用，每次都要創建的樣子？

        switch (symbol) {
            case "加", "+":
                ans = a + Double.parseDouble(bString);
                BigDecimal bigAnsAdd = bigA.add(bigB);
                System.out.println(a + " + " + Double.parseDouble(bString) + " = " + ans);
                System.out.println(bigA + " + " + bigB + " = " + bigAnsAdd);
                break;
            case "減", "-":
                ans = a - Double.parseDouble(bString);
                BigDecimal bigAnsSub = bigA.subtract(bigB);
                System.out.println(a + " - " + Double.parseDouble(bString) + " = " + ans);
                System.out.println(bigA + " - " + bigB + " = " + bigAnsSub);
                break;
            case "乘", "*", "x", "X":
                ans = a*Double.parseDouble(bString);
                BigDecimal bigAnsMul = bigA.multiply(bigB);
                System.out.println(a + " x " + Double.parseDouble(bString) + " = " + ans);
                System.out.println(bigA + " x " + bigB + " = " + bigAnsMul);
                break;
            case "除", "÷", "/":
                if (bString.equals("0")) {
                    System.out.println("除法中分母為零是無意義的");
                } else {
                    ans = a/Double.parseDouble(bString);
                    BigDecimal bigAnsDiv = bigA.divide(bigB, 5, RoundingMode.HALF_DOWN);
                    System.out.println( a + " ÷ " + Double.parseDouble(bString) + " = " + ans );
                    System.out.println( bigA + " ÷ " + bigB + " = " + bigAnsDiv );
                }
                break;
            default:
                System.out.println("請輸入正確算數符號");
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
            System.out.println("除法");
//            while ((String.valueOf(b)).equals("0")) {
//                System.out.println("您輸入的第二個數字" + b + "是零");
//                System.out.println("分母不可為零，請重新輸入第二個數字");
//                b = sc.nextDouble();
//            }
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

    static void standardWeight_useBigDecimal() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("將計算標準體重，請輸入性別（男、女）");
            String userGender = sc.next();
            if (!userGender.equals("男") & !userGender.equals("女")) {
                System.out.println("非常抱歉，請正確輸入生理性別");
                //sc.next();
                continue;
            }

            System.out.println("請輸入身高");
            String heightStr = sc.next(); //為何不能用nextLine()?
            double height = Double.parseDouble(heightStr);
            BigDecimal bigHeight = new BigDecimal(heightStr);
            if (userGender.equals("男") & height < 80) {
                System.out.println("男生身高需大於80");
            } else if (userGender.equals("女") & height < 70) {
                System.out.println("女生身高需大於70");
            } else {
                double stdWeightB = (height - 80)*0.7;
                double stdWeightG = (height - 70)*0.6;
                BigDecimal bigStdWeightB = (bigHeight.subtract(BigDecimal.valueOf(80))).multiply(BigDecimal.valueOf(0.7));
                BigDecimal bigStdWeightG = (bigHeight.subtract(BigDecimal.valueOf(70))).multiply(BigDecimal.valueOf(0.6));;

                System.out.println(userGender.equals("男")? stdWeightB: stdWeightG);
                System.out.println(userGender.equals("男")? bigStdWeightB: bigStdWeightG);
            }
        }
    }

}
