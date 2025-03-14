package com.lee.lesson_sample.basic;

import java.util.Scanner;

public class Check_0619_OddsCheck {
    public static void main(String[] args) {
        // 列出指定範圍內所有質數(只能被1和自己整除)
        //oddsCkeckTest();
        //oddsCkeckTest02();
        oddsCkeckTest03();
    }

    static void oddsCkeckTest() {
        int min = 10;
        int max = 20;
        //{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

        for (int i = min; i <= max ; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    count++;
                }
            }
            if (count != 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    static void oddsCkeckTest02() {
        int min = 10;
        int max = 20;
        //{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

        for (int i = min; i <= max ; i++) {
            boolean isOdd = true;
            for (int j = 2; j < i; j++) { // 可以寫更好，詳見下一個
                if (i % j == 0) {
                    isOdd = false;
                    break; // 只要觸發了這個條件，等於不是奇數了，也就不用再檢驗下去，故break
                }
            }
            if (!isOdd) {
                continue;
            }
            System.out.println(i);
        }
    }

    static void oddsCkeckTest03() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("請輸入起始數字(正整數)");
        String strMin = sc.nextLine();
        System.out.println("請輸入結尾數字(正整數)");
        String strMax = sc.nextLine();
        System.out.println(strMin + " " + strMax);

        int min = Integer.parseInt(strMin);
        int max = Integer.parseInt(strMax);

        for (int i = min; i <= max; i++) {
            for (int j =) {

            }
        }



    }
}
