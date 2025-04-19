package com.lee.lesson_sample.object_basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        test();
//        test02();
        test03();
    }

    static void test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入成績");
        while (true) {
            try {
                int insert = sc.nextInt();
                if (insert < 0) {
                    System.out.println("成績不在合理範圍內！！");
                }else if (insert < 60) {
                    System.out.println("F");
                }else if (insert < 70) {
                    System.out.println("D");
                } else if (insert < 80) {
                    System.out.println("C");
                } else if (insert < 90) {
                    System.out.println("B");
                }else if (insert <= 100 ){
                    System.out.println("A");
                }else {
                    System.out.println("成績不在合理範圍內！！");
                }
            }catch (InputMismatchException e) {
                System.out.println("正整數please");
                sc.next();
            }
        }
    }

    static void test02() {
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入成績");
        boolean valid = false;
        do {
            valid = false;
            try {
                int insert = sc.nextInt();
                if (insert < 0) {
                    System.out.println("成績不在合理範圍內！！");
                    valid = true;
                }else if (insert < 60) {
                    System.out.println("F");
                }else if (insert < 70) {
                    System.out.println("D");
                } else if (insert < 80) {
                    System.out.println("C");
                } else if (insert < 90) {
                    System.out.println("B");
                }else if (insert <= 100 ){
                    System.out.println("A");
                }else {
                    System.out.println("成績不在合理範圍內！！");
                    valid = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("正整數please");
                sc.next();
            }
        } while (!valid);
    }

    // 除以十！！！！！太神啦
    static void test03() {
        Scanner sc = new Scanner(System.in);
        boolean isDo = true;
        while (isDo) {
            try {
                int insert = sc.nextInt();
                if (insert < 0 || insert > 100) {
                    System.out.println("超出範圍");
                    continue;
                }else {
                    switch (insert/10) {
                        case 0, 1, 2, 3, 4, 5:
                            System.out.println("F");
                            break;
                        case 6:
                            System.out.println("D");
                            break;
                        case 7:
                            System.out.println("C");
                            break;
                        case 8:
                            System.out.println("B");
                            break;
                        case 9, 10:
                            System.out.println("A");
                            break;
                    }
                    isDo = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("格式錯誤！");
                sc.next();
            }


        }
    }
}
