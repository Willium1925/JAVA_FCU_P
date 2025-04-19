package com.lee.lesson_sample.final_test;

import java.util.Scanner;

// 肥宅快樂水
// 在這時快要渴死的你在全聯看到店員正貼著這樣的宣傳單: "三瓶空的可口可樂瓶可以換一瓶可樂"
// 現在你決定在便利商店買一些可樂(就說N瓶好了), 你想知道你最多可以喝到多少瓶
// 下面的hint說明
// 當 N=8 時候的情況. 方法一是標準的做法:
// 在你喝了 8 瓶可樂之後, 你有 8 個空罐子, 把其中 6 瓶空罐子換成 2 瓶新的, 喝完之後你就有 4 瓶空罐子,
// 然後你又可以拿 3 瓶換 1 瓶新的, 最後, 你只有 2 個空罐子, 所以你再也不能再換新的可樂了.
// 所以你總共可以喝到 8 + 2 + 1 = 11 瓶可樂.
//
// 可是其實你有一個更好的方法! 在第二種方法裡面,
// 你可以先和你的朋友(或者是店員??)借一個空罐子, 然後你就可以喝到 8 + 3 + 1 = 12 瓶可樂! 當然, 你最後要把 1 瓶空罐子還給你的朋友.
// Input 輸入有好幾組資料，每一組一行， 每一行有一個正整數 N (1 <= N <= 200)。
// Output 對於每組輸入，輸出你最多可以喝到幾瓶可樂。你可以和你的朋友借一些空罐子，但是請記得還給他一樣數量的空罐子。
// 7 7%3=1 7+(1-1)
// 8 8%3=2 8+(2-1) 非3倍數，就借(餘數-1)瓶
// 9               是3倍數，就借3瓶
//
// 12
// 13
public class Problem08 {
    public static void main(String[] args) {
        //test02();
        //ans01();
        //ans02();
        ans03();
        //ans04();
    }

    static void test01() {
//        int bought = 8;
//        int exchange = 0;
//        int barrow = 0;
//        int drank = 0;
//        while ()
//        drank = (bought/3) + bought%3+1;

//        8滿 0空        8
//            8空
//        2滿 2空
//        2滿 2空+1借空
//        3滿            3
//            3空
//        1滿            1
//            1空
        Scanner sc = new Scanner(System.in);
            int bfull = sc.nextInt();
            int bempt = 0;
            int borrow = 0;
            int count = bfull;
            while (bfull >= 3) {
                if (bfull%3 == 2) {
                    bfull = (bfull/3) + ((bfull%3)+1)/3;
                    borrow++;
                    bempt = bfull;
                } else {
                    bfull = bfull/3;
                    bempt = bfull + (bfull%3);
                }
                if (bempt == borrow) {
                    count = count + bfull;
                    break;
                }
                count = count + bfull;
            }
            System.out.println(count);
    }

    static void test02() {
        Scanner sc = new Scanner(System.in);
        int bfull = sc.nextInt();
        int bempt = bfull;
        int borrow = 0;
        int count = bfull;
        while (bempt >= 3) {
            if (bfull%3 == 2) {
                bfull = (bfull/3) + ((bfull%3)+1)/3;
                borrow++;
                bempt = bfull;
            } else {
                bempt = bfull%3;
                bfull = bfull/3;
                bempt = bempt + bfull;
            }
            if (bempt == borrow) {
                count = count + bfull;
                break;
            }
            count = count + bfull;
        }
        System.out.println(count);
    }

//        8滿 0空        8
//            8空
//        2滿 2空
//        2滿 2空+1借空
//        3滿            3
//            3空
//        1滿            1
//            1空
    static void test03() {
        Scanner sc = new Scanner(System.in);
        int full = sc.nextInt();
        int empty = full;
        int newfull = 0;
        int leftempty = 0;
        int borrow = 0;

        newfull = full/3;
        leftempty = full%3;
        if (leftempty == 2) {
            leftempty = leftempty +1;
            borrow++;
        }



    }

    static void ans01() {
        Scanner input = new Scanner(System.in);
        while(true){
            int b1 = input.nextInt();
            int orig = b1;
            if (b1==0) {
                break;
            }
            int b2 = 0;
            while(b1>2){
                int newb = b1/3;
                b2 = b2 + newb;
                b1 = b1%3;
                b1 = b1 + newb;
            }
            if(b1==2)b2++;
            System.out.println(orig + b2);
        }
    }

    static void ans02() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int bfull = sc.nextInt(); // 讀取初始瓶數
            int count = bfull; // 記錄總共喝了幾瓶
            int empty = bfull; // 記錄當前的空瓶數

            while (empty >= 3) { // 當有足夠的空瓶可以兌換時
                int newDrink = empty / 3; // 兌換的新飲料
                count += newDrink; // 加入總數
                empty = empty % 3 + newDrink; // 更新剩餘空瓶數
            }

            // 如果最後剩2個空瓶，可以向店家借1瓶，再喝完還回來
            if (empty == 2) {
                count++;
            }

            System.out.println(count);
        }
        sc.close();
    }

    static void ans03() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int bfull = sc.nextInt(); // 初始滿瓶數

            if (bfull <= 0 || bfull > 200) {
                break;
            }
            int count = bfull; // 紀錄喝了幾瓶
            int empty = bfull; // 記錄當前空瓶數

            while (empty >= 3) { // 當有足夠的空瓶可以兌換時
                int newDrink = empty / 3; // 兌換的新滿瓶
                count += newDrink; // 新的喝光，加進計數
                empty = empty % 3 + newDrink; // 更新剩餘空瓶數
            }

            // 剩2瓶再借，喝完剛好還回來
            if (empty == 2) {
                count++;
            }

            System.out.println(count);
        }
        sc.close();
    }

    static void ans04() {
        Scanner sc=new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            if (a >= 1 && a <= 200) {
                int sum = a;
                a++;
                while (a > 0) {

                    int b = a / 3;
                    int c = a % 3;
                    sum += b;

                    b += c;

                    if (b >= 3) {
                        a = b;
                    } else if (b < 3) {
                        a = 0;
                    }
                }
                System.out.println(sum);

            }else {
                break;
            }

        }
    }
}
