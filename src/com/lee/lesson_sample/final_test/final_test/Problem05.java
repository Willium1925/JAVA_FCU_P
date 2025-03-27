package com.lee.lesson_sample.final_test.final_test;

import java.util.Scanner;

// 請讓使用者輸入一個分數
// 如果大於等於60請輸出pass
// 若是90分以上，請額外輸出excellent
// 50~59請輸出almost pass
// 否則輸出fail
// Input 輸入一個分數, 輸出等第.
// Output 如果大於等於60請輸出pass
// 若是90分以上，請額外輸出excellent
// 50~59請輸出almost pass
// 否則輸出fail
// 90   pass
public class Problem05 {
    public static void main(String[] args) {
        test01();
    }

    static void test01() {
        Scanner sc = new Scanner(System.in);
        int insert = sc.nextInt();

        if (insert < 50) {
            System.out.println("fail");
        }else if (insert < 60) {
            System.out.println("almost pass");
        }else if (insert < 90) {
            System.out.println("pass");
        }else if (insert < 100) {
            System.out.println("pass\nexcellent");
        }
    }
}


