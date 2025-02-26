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
}
