package com.lee.self_practice.object_basic;

public class String_test {
    public static void main(String[] args) {
//        String str;
//        System.out.println(str); //java: variable str might not have been initialized

//        String strEm = "";
//        System.out.println(strEm); // 就是空
//
//        String strNew = new String();
//        System.out.println(strNew); // 就是空

//        String strA = "安安";
//        String strB = "安安";
//        System.out.println(strA == strB); // 此宣告方式會將安安放在字串池，字串池若有相同的東西會重複使用
//        System.out.println(strA.equals(strB));
//
//        String strAnew = new String("安安");
//        String strBnew = new String("安安");
//        System.out.println(strAnew == strBnew); // 用new String()的方式宣告就會獨立創建一個物件，而不放進字串持，故指向的記憶體位置不同
//        System.out.println(strAnew.equals(strBnew)); // 單純比較字串內容是否相同

        String strFront = "我是";
        String strBack = "英雄";
        String strFplusB = strFront + strBack;
        String strAll = "我是英雄";

        System.out.println(strFplusB);
        System.out.println(strAll);

        System.out.println(strFplusB == strAll);
        System.out.println(strFplusB.equals(strAll)); // 單純比較字串內容是否相同

        String strAllNew = new String("我是英雄");
        System.out.println(strAll == strAllNew);

    }
}
