package com.lee.lesson_sample.final_test;

// 使用者輸入2個正整數，w和h，程式顯示出 w x h 的加法矩陣
// 輸出w x h 的加法矩陣，最後必須有換⾏字元。
// 注意: 每⼀個數值都佔掉 5位數的字元位置。數字與數字之間不用空白，透過5位數值的字元位置。
// 4 3
//    0    1    2    3    4
//    1    2    3    4    5
//    2    3    4    5    6
//    3    4    5    6    7
// 4 8
//    0    1    2    3    4
//    1    2    3    4    5
//    2    3    4    5    6
//    3    4    5    6    7
//    4    5    6    7    8
//    5    6    7    8    9
//    6    7    8    9   10
//    7    8    9   10   11
//    8    9   10   11   12


import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        //System.out.println("123\t\t13222");
        //System.out.println("5\t\tc123");
        //System.out.println("999999\t123");
        test01();
    }

    static void test01() {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        for (int j = 0; j <= h; j++) {
            for (int i = j; i <= w+j; i++) {
                System.out.print(String.format("%5d", i));
            }
            System.out.print("\n");
        }
    }
}
