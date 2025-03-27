package com.lee.lesson_sample.final_test.final_test;

//輸入n 輸出聖誕樹
//Input   n n>3
//Output
//由 * 組成聖誕樹樹葉部分:
//高:n
//寬:n*2-1
//樹幹部分:
//3*3
//樹葉和樹幹中間要對齊
//5
//    *
//   ***
//  *****
// *******
//*********
//   ***
//   ***
//   ***

import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        test01();
    }

    static void test01() {
        Scanner sc = new Scanner(System.in);
        int insert = sc.nextInt();
        for (int i = 1; i <= insert; i++) {
            // 空白輸出
            for (int spa = 1; spa <= insert-i; spa++) {
                System.out.print(" ");
            }
            // 星星輸出
            for (int str = 1; str <= 1+2*(i-1); str++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <= insert-2; i++) {
                System.out.print(" ");

            }
            System.out.println("***");
        }
    }
}
