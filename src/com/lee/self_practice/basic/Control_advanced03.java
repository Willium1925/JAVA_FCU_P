package com.lee.self_practice.basic;

import java.util.Scanner;

public class Control_advanced03 {
    public static void main(String[] args) {

        add02();

    }

    static void add01() {
        System.out.println("add01運作，請輸入正整數，或輸入e結束");
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("請輸入正整數");
                return;
            }

            if (sc.nextLine() == "e") {
                System.out.println("系統關閉");
                break;
            }

            int userInput = sc.nextInt();
            int total = 0;
            for (int i = 1; i <= userInput; i++) {
                total = total + i;
            }

            System.out.println("1~" + userInput +"的總和是" + total);

        }
    }

    static void add02() {
        System.out.println("add02運作，請輸入正整數，或輸入e結束");
        Scanner sc = new Scanner(System.in);
        while (true) {


            if (sc.nextLine() == "e") {
                System.out.println("系統關閉");
                break;
            } else if (!sc.hasNextInt()) {
                System.out.println("請輸入正整數");
                return;
            }

            int userInput = sc.nextInt();
            int total = 0;
            for (int i = 1; i <= userInput; i++) {
                total = total + i;
            }

            System.out.println("1~" + userInput +"的總和是" + total);

        }
    }
}
