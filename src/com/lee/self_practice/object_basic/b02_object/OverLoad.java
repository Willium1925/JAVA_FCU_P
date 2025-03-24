package com.lee.self_practice.object_basic.b02_object;

import java.util.Scanner;

public class OverLoad {

    public static void main(String[] args) {
        CountAvg countAvg = new CountAvg();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("輸入想相加的2數請輸入二，多數相加請輸入多");
            String str = sc.nextLine();
            if (str.equals("二")) {
                System.out.println("請輸入第一個數");
                int a = sc.nextInt();
                System.out.println("請輸入第二個數");
                int b = sc.nextInt();
                countAvg.setA(a);
                countAvg.setB(b);
                System.out.println(a + "加" + b +"等於:" + countAvg.getSum(a, b));
            } else if (str.equals("多")) {
                System.out.println("請輸入任意個數的數字");
                String strInt = sc.nextLine();
                System.out.println("多數結果為:" + countAvg.getSum(strInt));
            }
        }
    }
}
