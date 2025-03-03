package com.lee.self_practice.class_basic;

import java.util.Scanner;

class Test01 {
    static int a = 10;
    static  String s = "aaa222";
}

class Test02 {
    static int a = 20;
    public static void main(String[] args) {
//        int a = 30;
//        System.out.println(Test01.a);
//        System.out.println(Test02.a);
//
//        Poeple01.talk();
//        Poeple01.talk_advanced("進階說話");
//        Poeple01.talk_advanced("請輸入想說的話:");
//        Scanner sca = new Scanner(System.in);
        //System.out.println(sca.nextLine());
        //Poeple01.talk_advanced(sca.nextLine());

        //BasicMath.counter(6,7);
        //BasicMath.counter((Integer.parseInt(Poeple01.talk_advanced(sca.nextLine()))), (Integer.parseInt(Poeple01.talk_advanced(sca.nextLine()))));

        System.out.println("請輸入第一個數字");
        Scanner sca003 = new Scanner(System.in);
        int x = Integer.parseInt(Poeple01.talk_advanced(sca003.nextLine()));
    }
}

class Poeple01 {
    static void talk(){
        System.out.println("單純說話");
    }

    static void talk_advanced(String string){
        System.out.println(string);
    }
}

class BasicMath {
    static  void counter(int a, int b){
        int total = a + b;
        System.out.println(total);
    }
}