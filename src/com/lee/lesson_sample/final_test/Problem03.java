package com.lee.lesson_sample.final_test;

import java.util.Scanner;

// 請設計程式，根據輸⼊之及⽇期，輸出對應之星座輸出。
//1997年 1⽉ 21⽇ ~ 1997年 2⽉ 18⽇ ⽔瓶 (Aquarius)
//1997年 2⽉ 19⽇ ~ 1997年 3⽉ 20⽇ 雙⿂ (Pisces)
//1997年 3⽉ 21⽇ ~ 1997年 4⽉ 20⽇ 牡⽺ (Aries)
//1997年 4⽉ 21⽇ ~ 1997年 5⽉ 21⽇ ⾦⽜ (Taurus)
//1997年 5⽉ 22⽇ ~ 1997年 6⽉ 21⽇ 雙⼦ (Gemini)
//1997年 6⽉ 22⽇ ~ 1997年 7⽉ 22⽇ 巨蟹 (Cancer)
//1997年 7⽉ 23⽇ ~ 1997年 8⽉ 23⽇ 獅⼦ (Leo)
//1997年 8⽉ 24⽇ ~ 1997年 9⽉ 23⽇ 處⼥ (Virgo)
//1997年 9⽉ 24⽇ ~ 1997年 10⽉ 23⽇ 天秤 (Libra)
//1997年10⽉ 24⽇ ~ 1997年 11⽉ 22⽇ 天蠍 (Scorpio)
//1997年11⽉ 23⽇ ~ 1997年 12⽉ 21⽇ 射⼿ (Sagittarius)
//1997年12⽉ 22⽇ ~ 1998年 1⽉ 20⽇ 摩羯 (Capricorn)
//
//Input   請輸⼊⽉(int)及⽇期(int)。
//Output  依照星座標準，將及⽇期轉成星座(String)輸出，最後必須有換⾏字元。
//
// 4 15   ---   Aries
public class Problem03 {
    public static void main(String[] args) {
        test01();
    }

    static void test01() {
        Scanner sc = new Scanner(System.in);
        int insertMonth = sc.nextInt();
        int insertDate = sc.nextInt();
        //String[][] Aquarius = new String[][]{{月, 起始日, 結尾日}, {月, 起始日, 結尾日}}
        //String[][] Aquarius = new String[][]{{"1", "21", "31"}, {"2", "1", "18"}};
        // 一月，20號之前摩羯，21號後水瓶
        switch (insertMonth) {
            case 1:
                System.out.print(insertDate >= 21 ? "Aquarius\n" : "Capricorn\n");
                break;
            case 2:
                System.out.print(insertDate >= 19 ? "Pisces\n" : "Aquarius\n");
                break;
            case 3:
                System.out.print(insertDate >= 21 ? "Aries\n" : "Pisces\n");
                break;
            case 4:
                System.out.print(insertDate >= 21 ? "Taurus\n" : "Aries\n");
                break;
            case 5:
                System.out.print(insertDate >= 22 ? "Gemini\n" : "Taurus\n");
                break;
            case 6:
                System.out.print(insertDate >= 22 ? "Cancer\n" : "Gemini\n");
                break;
            case 7:
                System.out.print(insertDate >= 23 ? "Leo\n" : "Cancer\n");
                break;
            case 8:
                System.out.print(insertDate >= 24 ? "Virgo\n" : "Leo\n");
                break;
            case 9:
                System.out.print(insertDate >= 24 ? "Libra\n" : "Virgo\n");
                break;
            case 10:
                System.out.print(insertDate >= 24 ? "Scorpio\n" : "Libra\n");
                break;
            case 11:
                System.out.print(insertDate >= 23 ? "Sagittarius\n" : "Scorpio\n");
                break;
            case 12:
                System.out.print(insertDate >= 22 ? "Capricorn\n" : "Sagittarius\n");
                break;
        }
    }
}
