package com.lee.lesson_saple.basic;

import java.util.Scanner;

public class HomeWork_0227 {
    public static void main(String[] args) {

//        假設某個自動售票機只能接受10元、5元、1元的硬幣。
//        請設計一程式，當使用者輸入一小於999的正整數數字時，他所需投入各種幣值硬幣最少的數量分別是多少？若數字大於999則顯示：輸入過大。
//        例如
//        使用者輸入：123，則程式顯示：10元12個，5元0個，2元3個。
          /*
            n=1x+5y+10z
            n/10=z
            (n%10)/5=y
            (n%5)=x
            */
//        System.out.println("請指定一正整數n，不得超過999");
//        Scanner s01 = new Scanner(System.in);
//        int n01 = s01.nextInt();
//        int z = n01/10;
//        int y = (n01%10)/5;
//        int x = (n01%5);
//        System.out.println(n01 + "總共需要" + "\n"
//                                            + z + "個十元" + "\n"
//                                            + y + "個五元" + "\n"
//                                            + x + "個一元" );




//        請撰寫一程式，計算出輸入之整數除以13的商數與餘數。
//        例如：
//        輸入26，輸出商數=2、餘數=0。
//        System.out.println("請輸入任意正整數");
//        Scanner s02 = new Scanner(System.in);
//        int userInsert02 = s02.nextInt();
//        int a = (userInsert02-(userInsert02%13))/13;
//        int b = userInsert02%13;
//        System.out.println(userInsert02 + "除以13" + "，商數是" + a + "，餘數是" + b );






//        雞兔同籠計算機程式，使用者輸入頭腳分別是多少，程式輸出雞兔各有幾隻。
//        例如：
//        頭8，腳26，輸出為：雞3，兔5。若無解則輸出："該數據無解"。
//        2*c+4*r=footNum; //必正偶數
//        c+r=headNum; //正整數
//
//        2*c+2*r=2*headNum;
//        footNum-2*headNum=2*r;

//        System.out.println("有多少隻腳？");
//        Scanner s03 = new Scanner(System.in);
//        int footNum = s03.nextInt();
//        //s03.next(); // 為何不用打這行？
//        System.out.println("有多少顆頭？");
//        int headNum = s03.nextInt();
//
//        if ((footNum-2*headNum)%2 == 0) {
//            int r = (footNum-2*headNum)/2;
//            int c = headNum - r;
//            System.out.println("總共有" + c + "隻雞，" + r + "隻兔子");
//        } else {
//            System.out.println("該數據無解");
//        }




//        請設計一程式，讓使用者輸入任意整數，程式判斷該數字為奇數或偶數。
//        例：輸入5，輸出奇數；輸入6，輸出偶數。
        System.out.println("請輸入任意正整數");
        Scanner s04 = new Scanner(System.in);
        int userInsert = s04.nextInt();
        System.out.println(userInsert%2 == 0 ? "是偶數" : "是奇數" );

//        請設計一程式，從使用者得到一大於0的整數數字n，輸出1+2+3+..+n之結果。
//        例如：輸入5，輸出15
//        System.out.println("請指定一正整數n，將計算1~n之總和");
//        Scanner s05 = new Scanner(System.in);
//        int userInsert = s05.nextInt();
//        int sum = 0;
//        for (int i = 1 ; i <= userInsert ; i++) {
//            sum = sum + i;
//        }
//        System.out.println("1~" + userInsert + "的總和為" + sum);




    }



}
