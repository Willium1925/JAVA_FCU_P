package com.lee.lesson_sample.basic;

import java.util.Scanner;

public class Check_0619_PrimesCheck {
    public static void main(String[] args) {
        // 列出指定範圍內所有質數(只能被1和自己整除)
        //primesListTest();
        //primesListTest02();
        //primesListTest03();
        primesListTest04();
    }

    static void primesListTest() {
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

    static void primesListTest02() {
        int min = 10;
        int max = 20;
        //{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        for (int i = min; i <= max ; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) { // 可以寫更好，詳見下一個
                if (i % j == 0) {
                    isPrime = false;
                    break; // 只要觸發了這個條件，等於不是質數了，也就不用再檢驗下去，故break
                }
            }
            if (!isPrime) {
                continue;
            }
            System.out.println(i);
        }
    }

    static void primesListTest03() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("請輸入起始數字(正整數)");
        String strMin = sc.nextLine();
        System.out.println("請輸入結尾數字(正整數)");
        String strMax = sc.nextLine();
        System.out.println(strMin + "到" + strMax + "之間的質數如下:");

        int min = Integer.parseInt(strMin);
        int max = Integer.parseInt(strMax);

        for (int i = min; i <= max; i++) {
            if (i == 1) {
                continue;
            }
            boolean isPrime = true;
            // 若有因數，都是小配大，過了平方根的位置後就只是交換，變成大配小，所以檢查到平方根就好
            // 然後對，可以這樣寫j*j當作條件範圍，AI說的
            for (int j =2; j*j <= i; j++) {
                if (i == 2) { // 如果是2，直接判斷是質數
                    break;
                }
                if (i%j == 0) { // 一旦=0代表i不是質數，就不要她了
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
        sc.close();
    }

    static void primesListTest04() {


        while (true) {
            Scanner sc  = new Scanner(System.in);
            System.out.println("請輸入起始數字(正整數)");
            String strMin = sc.nextLine();
            System.out.println("請輸入結尾數字(正整數)");
            String strMax = sc.nextLine();
            try {
                int min = Integer.parseInt(strMin);
                int max = Integer.parseInt(strMax);
                System.out.println(strMin + "到" + strMax + "之間的質數如下:");
                for (int i = min; i <= max; i++) {
                    if (i == 1) {
                        continue;
                    }
                    boolean isPrime = true;
                    // 若有因數，都是小配大，過了平方根的位置後就只是交換，變成大配小，所以檢查到平方根就好
                    // 然後對，可以這樣寫j*j當作條件範圍，AI說的
                    for (int j =2; j*j <= i; j++) {
                        if (i == 2) { // 如果是2，直接判斷是質數
                            break;
                        }
                        if (i%j == 0) { // 一旦=0代表i不是質數，就不要她了
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.println(i);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("請輸入有效正整數");
            }
        }
    }
}
