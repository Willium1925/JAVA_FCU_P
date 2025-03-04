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

        Scanner sca003 = new Scanner(System.in);
        System.out.println("請輸入第一個數字");
        //System.out.println((sca003.nextLine()).getClass());
        //System.out.println(Poeple01.talk_advanced(sca003.nextLine())); // 這是多餘的
        //Poeple01.talk_advanced(sca003.nextLine()); // 這樣就可以了


        //int x = Integer.parseInt(Poeple01.talk_advanced(sca003.nextLine())); // 這不行，因為我寫的Poeple01.talk_advanced方法，結果是SYSO，並不會產出其他東西，當然也就無法放進來用
        int xr01 = Integer.parseInt(Poeple01.talk_advanced_R(sca003.nextLine())); // 這應該就可以了

        System.out.println("請輸入第二個數字");
        int xr02 = Integer.parseInt(Poeple01.talk_advanced_R(sca003.nextLine())); // 這應該就可以了

        //System.out.println(BasicMath.counter(xr01, xr02)); // 同理，BasicMath.counter方法的結果是SYSO，不可行
        System.out.println("兩數相加結果為:" + BasicMath.counter_advanced_R(xr01, xr02));
    }
}

class Poeple01 {
    static void talk(){
        System.out.println("單純說話");
    }

    static void talk_advanced(String string){
        System.out.println(string);
    }

    static String talk_advanced_R(String string){
        return string;
    }
}

class BasicMath {
    static  void counter(int a, int b){
        int total = a + b;
        System.out.println(total);
    }
    static int counter_advanced_R(int a, int b) {
        int total = a + b;
        return total;
    }
}