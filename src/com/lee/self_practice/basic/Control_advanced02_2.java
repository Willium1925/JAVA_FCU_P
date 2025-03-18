package com.lee.self_practice.basic;

import java.util.Scanner;

public class Control_advanced02_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("請指定星星數量（輸入 end 結束）");

        while (true) {
            System.out.print("請輸入正整數或輸入 'end' 來結束: ");

            if (s.hasNextInt()) {  // 檢查是否為整數
                int maxStars = s.nextInt();

                if (maxStars <= 0) {  // 檢查是否為正整數
                    System.out.println("請輸入大於 0 的正整數！");
                    continue; // 重新要求輸入
                }

                // 印出星星圖案
                for (int row = maxStars; row >= 1; row--) {
                    for (int star = row; star >= 1; star--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            } else {
                String input = s.next();  // 讀取非整數的輸入

                if (input.equalsIgnoreCase("end")) {  // 如果是 "end" 則結束
                    System.out.println("程式結束！");
                    break; // break是影響最近的迴圈，所以即便看起來是在if結構裡，仍舊中斷while迴圈
                } else {
                    System.out.println("輸入無效，請輸入正整數或 'end' 來結束！");
                }
            }
        }
        s.close();
    }

    static void abandom() {
        /*倒三角形星號，輸入一個數 n，用 * 印出倒三角形，例如：
        *****
        ****
        ***
        **
        *
        /*
        Scanner s = new Scanner(System.in);
        System.out.println("請指定星星數量");
        int userStar = s.nextInt();
        int i = userStar;
        while(i>=1) {
            for(int j=i ; j >= 1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
        s.close();
        */

        /*
        Scanner s = new Scanner(System.in);
        //String string1 = new String("end");
        if (s.hasNext()) {
            String string_next = s.next();
            String string_valueOf = String.valueOf(s);
            String string_toString = s.toString();

            System.out.println("s.next() = "+string_next);
            System.out.println("String.valueOf(s) = "+string_valueOf);
            System.out.println("s.toString() = "+string_toString);
        }
        */


//        Scanner s = new Scanner(System.in);
//        System.out.println("請指定星星數量");
//        while (s.hasNext()) {
//
//            int maxStars = s.nextInt();
//            for(int row = maxStars ; row >= 1 ; row--) {
//                for(int star = row ; star >= 1 ; star-- ) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//
//        }

//        Scanner ss = new Scanner(System.in);
//        String end;
//        if (ss.hasNext()) {
//            String userInsert = ss.next();
//            System.out.println(userInsert);
//            System.out.println(userInsert.equals("end"));
//        }

//        System.out.println("請指定星星數量");
//        Scanner s = new Scanner(System.in);
/*
        while (true) {

            if (s.hasNext()) {
                int maxStars=0
                if (s.hasNextInt()&&(maxStars>0)) {
                     maxStars = s.nextInt();
                    if (maxStars>0) {
                        for(int row = maxStars ; row >= 1 ; row--) {
                            for(int star = row ; star >= 1 ; star-- ) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("請輸入正整數");
                        s.next();
                    }
                } else {
                    System.out.println("請輸入整數");
                    s.next();
                }
            } else {
                System.out.println("請輸入數字");
                s.next();
            }
            continue;
        }
        */
    }
}
