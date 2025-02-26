package com.lee.self_practice.basic;

import java.util.Scanner;

public class Control_advanced02 {

    public static void main(String[] args) {
        /*
        // 判斷質數，輸入 n，判斷 n 是否為質數（只能被 1 和 自己 整除）。
        System.out.println("請輸入一個正整數");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a<2) {
            System.out.println("您所輸入的數字"+a+"不是質數");
        }else {
            boolean isPrime = true;  // 假設是質數
            for(int i = 2 ; i < a ; i++) {
                if(a%i==0) {
                    isPrime = false;  // 找到因數，則不是質數
                    System.out.println(i+"是因數，所以"+a+"不是質數");
                    //break;  // 找到因數後直接跳出迴圈
                }
            }
            // 輸出結果
            if (isPrime) {
                System.out.println("您所輸入的數字 " + a + " 是質數");
            } else {
                System.out.println("您所輸入的數字 " + a + " 不是質數");
            }
        }
        s.close();

    }
    */


        // 費氏數列（Fibonacci)，輸入一個數 n，印出前 n 個費氏數列數字（Fibonacci: 0, 1, 1, 2, 3, 5, 8, ...）。

//        int a0 = 0;
//        int a1 = 1;
//        int a2 = a1 + a0;
//        int a3 = a2 + a1;
//        int an = a(n-1) + a(n-2);

        // 倒三角形星號，輸入一個數 n，用 * 印出倒三角形，例如：
//        *****
//        ****
//        ***
//        **
//        *
        /*
        Scanner s = new Scanner(System.in);
        System.out.println("請指定星星數量");
        int userStar = s.nextInt();
        int i = userStar;
        while(i>=1) {
            for(int j=i ; j >= 1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
        s.close();
        */

        Scanner s = new Scanner(System.in);
        System.out.println("請指定星星數量");
        int maxStars = s.nextInt();
        for(int row = maxStars ; row >= 1 ; row--) {
            for(int star = row ; star >= 1 ; star-- ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
