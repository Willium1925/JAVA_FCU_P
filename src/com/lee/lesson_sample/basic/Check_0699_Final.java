package com.lee.lesson_sample.basic;

import java.util.Scanner;

public class Check_0699_Final {
    public static void main(String[] args) {
        // 計算3的倍數總和
        //timeSumOfThree();
        // 計算2個整數間的所有整數之和
        //sumBetween();
        // 用*輸出矩形
        //rectangleWithStars();
        // 用*輸出菱形
        //diamondWithStars();
        //diamondWithStarsAns();
        //diamondWithStarsAns02();
        // 密碼檢查程式
        passwordCheck();
    }

    static void timeSumOfThree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入數字，將計算該數所有倍數之和");
        int num = sc.nextInt();
        System.out.println("請輸入上限");
        int max = sc.nextInt();
        long sum = 0;
        for (int i = num; i <= max; i = i+num) {
            sum = sum + i;
        }
        System.out.println("0到" + max + "所有" + num + "的倍數，其總和為:" + sum);
    }

    static void sumBetween() {
        Scanner sc = new Scanner(System.in);
        System.out.println("將計算指定兩數間所有整數之和");
        System.out.println("請指定起始數");
        int min = sc.nextInt();
        System.out.println("請指定終點數");
        int max = sc.nextInt();
        long sum = 0;
        long sum02 = 0;
        for (int i = min; i <= max; i++) {
            sum = sum + i;
        }
        sum02 = (max + min)*(max-min+1)/2;
        System.out.println(min + "到" + max + "之間所有整數之和為:" + sum);
        System.out.println(min + "到" + max + "之間所有整數之和為:" + sum02);
    }

    static void rectangleWithStars() {
        int heigh = 5;
        int wideth = 10;
        for (int h = 1; h <= heigh; h++) {
            if (h == 1 || h == heigh) { // 上邊緣跟下邊緣
                for (int w = 1; w <= wideth; w++) {
                    System.out.print("x ");
                }
                System.out.println();
            } else { // 左邊緣跟右邊緣
                System.out.print("x ");
                for (int w = 2; w < wideth; w++) {
                    System.out.print("  ");
                }
                System.out.println("x ");
            }
        }
    }

    static void diamondWithStars() {
    /*
       x    4
      xxx   345
     xxxxx  23456
    xxxxxxx 1234567
     */
        int insert = 4;
        if (insert%2 == 0) {

        } else {
            int max = insert+(insert-1);
            for (int i = 1; i <= max; i++) {
                if (i == (1+max)/2) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    static void diamondWithStarsAns() {
        int size = 6;
        if (size % 2 == 0) {
            size++; // 计算菱形大小
        }
        for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = size / 2 + 1; j > i + 1; j--) {
                System.out.print(" "); // 输出左上角位置的空白
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*"); // 输出菱形上半部边缘
            }
            System.out.println(); // 换行
        }
        for (int i = size / 2 + 1; i < size; i++) {
            for (int j = 0; j < i - size / 2; j++) {
                System.out.print(" "); // 输出菱形左下角空白
            }
            for (int j = 0; j < 2 * size - 1 - 2 * i; j++) {
                System.out.print("*"); // 输出菱形下半部边缘
            }
            System.out.println(); // 换行
        }
    }

    static void diamondWithStarsAns02() {
        int num = 5;//行数
        //打印上半部分菱形，外层循环控制行
        for (int i = 1; i <= num; i++) {
            //内层循环控制列
            //填充空白格
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            //三角形中心列及左半边
            for (int k = 1; k <= i; k++) {
                System.out.print(k);//输出符号时此括号填指定符号
            }
            //三角形右半边
            for (int n = i - 1; n >= 1; n--) {
                System.out.print(n);//输出符号填符号
            }
            //换行
            System.out.println();
        }
        //打印下半部分菱形，外层循环控制行
        for (int i = 1; i < num; i++) {
            //内层循环控制列
            //填充空白格
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            //三角形中心列及左半边
            for (int k = 1; k <= num - i; k++) {
                System.out.print(k);//输出符号填符号
            }
            //三角形右半边
            for (int n = num - 1 - i; n > 0; n--) {
                System.out.print(n);//输出符号填符号
            }
            //换行
            System.out.println();
        }
    }

    static void passwordCheck() {
        /*
        0~9 48~57
        A~Z 65~90
        a~z 97~122
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入密碼，12位，須包含數字和英文");
        String password = sc.nextLine();
        boolean hasNum = false;
        boolean hasEngBig = false;
        boolean hasEngLittle = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c >= '0' && c <= '9') {
                hasNum = true;
            }
            if (c >= 'A' && c <= 'Z') {
                hasEngBig = true;
            }
            if (c >= 'z' && c <= 'z') {
                hasEngLittle = true;
            }
        }

        if (!hasNum) {
            System.out.print("沒有數字!");
        }
        if (!hasEngBig) {
            System.out.print("沒有大寫字母!");
        }
        if (!hasEngLittle) {
            System.out.print("沒有小寫字母!");
        }

    }
}
