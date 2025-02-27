package com.lee.lesson_saple.basic;

import java.util.Scanner;

public class HomeWork_0227_AI {
    public static void main(String[] args) {

//        假設某個自動售票機只能接受10元、5元、1元的硬幣。
//        請設計一程式，當使用者輸入一小於999的正整數數字時，他所需投入各種幣值硬幣最少的數量分別是多少？若數字大於999則顯示：輸入過大。
//        例如
//        使用者輸入：123，則程式顯示：10元12個，5元0個，1元3個。
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("請輸入一個小於999的正整數：");
//        int amount = scanner.nextInt();
//
//        // 雖然冗長一些，但日後若要擴充較方便，三元運算子能處理的有限
//        if (amount > 999) {
//            System.out.println("輸入過大");
//        } else {
//            // 命名提高可讀性。
//            int tenCount = amount / 10;         // 計算10元硬幣數量
//            int fiveCount = (amount % 10) / 5;  // 計算5元硬幣數量
//            int oneCount = amount % 5;          // 剩下的就是1元硬幣數量
//
//            System.out.println(amount + " 總共需要：");
//            System.out.println(tenCount + " 個10元");
//            System.out.println(fiveCount + " 個5元");
//            System.out.println(oneCount + " 個1元");
//        }
//        scanner.close(); // 關閉 Scanner



//        請撰寫一程式，計算出輸入之整數除以13的商數與餘數。
//        例如：
//        輸入26，輸出商數=2、餘數=0。


        // next()：取得使用者輸入的字串(不包含空白字元、空白鍵、Tab)
        // nextLine()：取得使用者輸入的字串(包含空白字元、空白鍵、Tab)
        Scanner scan002 = new Scanner(System.in);
        //System.out.println(scan002.next());
        //System.out.println(scan002.next());

        //System.out.println((scan002.nextLine()).isEmpty());
        //System.out.println((scan002.next()).isEmpty());
        //System.out.println((scan002.nextLine()).getClass());
        //System.out.println(scan002.nextLine());
        //System.out.println();

//        if(scan002.hasNextLine()) {
//            System.out.println("有喔");
//        } else {
//            System.out.println("請輸入");
//        }
//
//        if(scan002.hasNext()) {
//            System.out.println("有喔");
//        } else {
//            System.out.println("請輸入");
//        }

//        String str = scan002.next();
//        String str = scan002.nextLine();
//        System.out.println(str.isEmpty());
//        System.out.println(str.trim().isEmpty());

        System.out.println(scan002.hasNextDouble());
//
//        while (true) {
//            System.out.println("請輸入任意正整數：");
//
//            // 檢查是否有輸入內容
//            if (!scan002.hasNext()) {
//                System.out.println("輸入不可為空，請重新輸入！");
//                scan002.nextLine();  // 清除換行符，避免無窮迴圈
//                continue;
//            }
//
//            // 檢查是否為數字
//            // hasNextDouble()可以接受所有數字格式（包含小數與整數）
//            if (!scan002.hasNextDouble()) {
//                System.out.println("請輸入有效的數字！");
//                scan002.nextLine();  // 清除錯誤輸入，避免無窮迴圈
//                continue;
//            }
//
//            double input = scan002.nextDouble(); // 讀取輸入值
//
//            // 檢查是否為整數（避免輸入小數）
//            if (input != Math.floor(input)) {
//                System.out.println("請輸入整數，不能有小數點！");
//                continue;
//            }
//
//            // 轉成 int 處理
//            number = (int) input;
//
//            // 檢查是否為正整數
//            if (number <= 0) {
//                System.out.println("請輸入正整數！");
//                continue;
//            }
//
//            // **所有條件通過，跳出迴圈**
//            break;
//        }
//
//        // 計算商數與餘數
//        int quotient = number / 13;
//        int remainder = number % 13;
//
//        System.out.println(number + " 除以 13，商數是 " + quotient + "，餘數是 " + remainder);
//
//        scan002.close(); // 關閉 Scanner






//        雞兔同籠計算機程式，使用者輸入頭腳分別是多少，程式輸出雞兔各有幾隻。
//        例如：
//        頭8，腳26，輸出為：雞3，兔5。若無解則輸出："該數據無解"。
//        2*c+4*r=footNum; //必正偶數
//        c+r=headNum; //正整數
//
//        2*c+2*r=2*headNum;
//        footNum-2*headNum=2*r;




//        請設計一程式，讓使用者輸入任意整數，程式判斷該數字為奇數或偶數。
//        例：輸入5，輸出奇數；輸入6，輸出偶數。



//        請設計一程式，從使用者得到一大於0的整數數字n，輸出1+2+3+..+n之結果。
//        例如：輸入5，輸出15




    }



}
