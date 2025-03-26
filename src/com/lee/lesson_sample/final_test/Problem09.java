package com.lee.lesson_sample.final_test;

import java.util.Scanner;

// 判斷是否迴文
// 從前面讀，從後面讀，結果都一樣，稱之迴文
// 輸入字串
// 輸出Yes No 要有換行字元
public class Problem09 {
    public static void main(String[] args) {
        test01();
    }

    static void test01() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.length());
        System.out.println(str.length()/2);
        boolean isABBA = true;
        for (int i = 0; i <= str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                isABBA = false;
                break;
            }
        }
        if (isABBA) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
