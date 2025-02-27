package com.lee.lesson_saple.basic;

import java.util.Scanner;

public class HomeWork_0227_AI {
    public static void main(String[] args) {

//        假設某個自動售票機只能接受10元、5元、1元的硬幣。
//        請設計一程式，當使用者輸入一小於999的正整數數字時，他所需投入各種幣值硬幣最少的數量分別是多少？若數字大於999則顯示：輸入過大。
//        例如
//        使用者輸入：123，則程式顯示：10元12個，5元0個，1元3個。
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入一個小於999的正整數：");
        int amount = scanner.nextInt();

        // 雖然冗長一些，但日後若要擴充較方便，三元運算子能處理的有限
        if (amount > 999) {
            System.out.println("輸入過大");
        } else {
            // 命名提高可讀性。
            int tenCount = amount / 10;         // 計算10元硬幣數量
            int fiveCount = (amount % 10) / 5;  // 計算5元硬幣數量
            int oneCount = amount % 5;          // 剩下的就是1元硬幣數量

            System.out.println(amount + " 總共需要：");
            System.out.println(tenCount + " 個10元");
            System.out.println(fiveCount + " 個5元");
            System.out.println(oneCount + " 個1元");
        }
        scanner.close(); // 關閉 Scanner





//        請撰寫一程式，計算出輸入之整數除以13的商數與餘數。
//        例如：
//        輸入26，輸出商數=2、餘數=0。
//        System.out.println("請輸入任意正整數");
//        Scanner s02 = new Scanner(System.in);
//        int userInsert02 = s02.nextInt();
//        int a = userInsert02/13;
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

        System.out.println("有多少隻腳？");
        Scanner s03 = new Scanner(System.in);
        int footNum = s03.nextInt();
        //s03.next(); // 為何不用打這行？
        System.out.println("有多少顆頭？");
        int headNum = s03.nextInt();

        int r = (footNum-2*headNum)/2;
        int c = headNum - r;
        String strCR = "總共有" + c + "隻雞，" + r + "隻兔子";

        if (headNum>footNum || r<0 || c<0) {
            System.out.println("該數據無解，你是否遭遇The THING");
        } else if ((footNum-2*headNum)%2 == 0) {
            System.out.println(strCR);
        } else {
            System.out.println("該數據無解");
        }


//        請設計一程式，讓使用者輸入任意整數，程式判斷該數字為奇數或偶數。
//        例：輸入5，輸出奇數；輸入6，輸出偶數。
//        System.out.println("請輸入任意正整數");
//        Scanner s04 = new Scanner(System.in);
//        int userInsert = s04.nextInt();
//        System.out.println(userInsert%2 == 0 ? "是偶數" : "是奇數" );

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
//        int summm = ((1+userInsert)*userInsert)/2;
//        System.out.println("1~" + userInsert + "的總和為" + summm);




    }



}
