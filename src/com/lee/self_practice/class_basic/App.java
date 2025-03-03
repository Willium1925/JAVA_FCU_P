package com.lee.self_practice.class_basic;

import java.util.Scanner;

class Test01 {
    static int a = 10;
    static  String s = "aaa222";
}

class Test02 {
    static int a = 20;
    public static void main(String[] args) {
        int a = 30;
        System.out.println(Test01.a);
        System.out.println(Test02.a);
        Test03.talk();
        Test03.talk_advanced("進階說話");
        Test03.talk_advanced("請輸入想說的話:");
        Scanner sca = new Scanner(System.in);
        //System.out.println(sca.nextLine());
        Test03.talk_advanced(sca.nextLine());
    }
}

class Test03 {
    static void talk(){
        System.out.println("單純說話");
    }

    static void talk_advanced(String string){
        System.out.println(string);
    }
}