package com.lee.self_practice.basic;

import java.util.Scanner;

public class Control_advanced03 {
    public static void main(String[] args) {
        add04();
        System.out.println("yoooooooo~"); // 拿來確認return的作用
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
            if (sc.nextLine().equals("e")) {
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

    static void add03() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("add03運作，請輸入正整數，或輸入e結束");
            String str = sc.nextLine();
            if (str.equals("e")) {
                System.out.println("系統關閉");
                break;
            } else if (Integer.parseInt(str) < 0) {
                System.out.println("請輸入正整數");
                return;
            }
            int userInput = Integer.parseInt(str);
            int total = 0;
            for (int i = 1; i <= userInput; i++) {
                total = total + i;
            }
            System.out.println("1~" + userInput +"的總和是" + total);
        }
        sc.close();
    }

    // NumberFormatException
    static void add04() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("add04運作，請輸入正整數，或輸入e結束");
            String str = sc.nextLine();
            try {
                if (str.equals("e")) {
                    System.out.println("系統關閉");
                    break;
                } else if (Integer.parseInt(str) < 0) {
                    System.out.println("請輸入正整數");
                    return; // 錯，回想起定義，return是搭配函式(function 函數 方法)使用，會直接離開函式，返回函式被呼叫的起始處
                    //continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("請正確輸入數字");
                //return; // 錯
                continue;
            }
            int userInput = Integer.parseInt(str);
            int total = 0;
            for (int i = 1; i <= userInput; i++) {
                total = total + i;
            }
            System.out.println("1~" + userInput +"的總和是" + total);
        }
        sc.close();
    }

    static void add05() {
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("add05運作，請輸入正整數，或輸入e結束");
                String str = sc.nextLine();
                if (str.equals("e")) {
                    System.out.println("系統關閉");
                    break;
                } else if (Integer.parseInt(str) < 0) {
                    System.out.println("請輸入正整數");
                    continue;
                }
                int userInput = Integer.parseInt(str);
                int total = 0;
                for (int i = 1; i <= userInput; i++) {
                    total = total + i;
                }
                System.out.println("1~" + userInput +"的總和是" + total);
            }
        } catch (NumberFormatException e) {
            System.out.println("請正確輸入數字");
            //continue; // 放這裡是無效的，因不在迴圈內
        }
        sc.close();
    }
}


