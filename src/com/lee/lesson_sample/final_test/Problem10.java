package com.lee.lesson_sample.final_test;

import java.util.Scanner;

// 撰寫⼀個程式，要求使用者輸⼊兩個數字，再從使用者取得這兩個數字
// 然後印出這兩個數字的 總和、乘積、差、商、和餘數。
// Input  依序輸⼊兩個整數(int)，整數範圍不超過 1000 。
// Output 輸出總和(int)、乘積(int)、差(int)、商(int)和餘數(int)(注意格式)，最後必須有換⾏字元。
// Sample Input 1
// 7 3
// 7+3=10
// 7*3=21
// 7-3=4
// 7/3=2...1
public class Problem10 {
    public static void main(String[] args) {
        test01();
    }

    static void test01() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + "+" + b + "=" + (a+b));
        System.out.println(a + "*" + b + "=" + (a*b));
        System.out.println(a + "-" + b + "=" + (a-b));
        System.out.println(a + "/" + b + "=" + (a/b) + "..." + (a%b));
    }
}
