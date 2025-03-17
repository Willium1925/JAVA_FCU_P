package com.lee.lesson_sample.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Check_0623_Factorial {
    public static void main(String[] args) {
        // 計算階層的程式
        // 指定正整數，輸出該數的階層計算，並詢問是否繼續
        //factorialTest00();
        factorialTest02();
    }

    static void factorialTest00() {
        Scanner sc = new Scanner(System.in);
        boolean contin = true;
        while (contin) {
            System.out.println("請輸入指定尾數，將計算階層");
            try {
                if (sc.hasNextInt()) {
                    int userInsert = sc.nextInt();
                    long facto = 1L;
                    for (int i = 1; i <= userInsert; i++) {
                        facto = facto*i;
                    }
                    System.out.println("總階層乘積為:" + facto);
                }
            } catch (NumberFormatException e) {
                System.out.println("請輸入正確正整數");
                continue;
            }
            System.out.println("輸入1繼續，輸入2結束程式");
            while (true) {
                try {
                    if (sc.hasNextInt()) {
                        int select = sc.nextInt();
                        switch (select) {
                            case 1:
                                break;
                            case 2:
                                System.out.println("程式結束");
                                contin = false;
                            default:
                                System.out.println("敢不敢好好輸入1或2");
                                continue;
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("請輸入正確指令:1繼續，2結束程式");
                    continue;
                }
            }
        }
    }

    static void factorialTest02() {
        Scanner sc = new Scanner(System.in);
        boolean contin = true;
        System.out.println("請輸入指定尾數，將計算階層");
        while (contin) {
            try {
                    int userInsert = sc.nextInt();
                    long facto = 1L;
                    for (int i = 1; i <= userInsert; i++) {
                        facto = facto*i;
                    }
                    System.out.println("總階層乘積為:" + facto);
            } catch (InputMismatchException e) {
                System.out.println("請輸入正確正整數");
                sc.nextLine(); // 這裡不加會無限循環
                continue;
            }
            System.out.println("輸入1繼續，輸入2結束程式");

            while (true) {
                try {
                        int select = sc.nextInt();
                        if (select == 1) {
                            //sc.nextLine(); // 記得加，避免死循環
                            break;
                        } else if (select == 2) {
                            //contin = false;
                            System.out.println("再見");
                            return; // 結束整個方法
                        } else {
                            System.out.println("要嘛1要嘛2，敢不敢好好打字");
                            //sc.nextLine(); // 記得加，避免死循環
                        }
                } catch (InputMismatchException e) {
                    System.out.println("請輸入正確指令:1繼續，2結束程式");
                    //sc.nextLine(); // 記得加，避免死循環
                }
            }
            System.out.println("謝謝使用，程式繼續");
        }
    }

}
