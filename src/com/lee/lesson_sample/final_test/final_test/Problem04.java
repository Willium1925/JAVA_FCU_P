package com.lee.lesson_sample.final_test.final_test;

// 寫一個程式用 for 迴圈來找出輸入的十個數字的最大值和最小值，數值不限定為整數，且值可存放於 float 型態數值內。
// Input   輸入十個數字，以空白間隔。
// Output  輸出數列中的最大值與最小值，輸出時需附上小數點後兩位數字，最後必須有換行字元。
// -2 -15.2 0 89.5 100 25.3 7 30 76 4
// max: 100.00
// min: -15.20

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        test01();
    }

    static void test01() {
        double[] insertDoubleArray = new double[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            insertDoubleArray[i] = sc.nextDouble();
        }
        BigDecimal[] insertBigArray = new BigDecimal[insertDoubleArray.length];
        for (int i = 0; i < insertDoubleArray.length; i++) {
            insertBigArray[i] = BigDecimal.valueOf(insertDoubleArray[i]);
        }
        BigDecimal max = insertBigArray[0];
        BigDecimal min = insertBigArray[0];
        for (BigDecimal bd: insertBigArray) {
            if (bd.compareTo(max) > 0) {
                max = bd;
            }
        }
        for (BigDecimal bd: insertBigArray) {
            if (bd.compareTo(min) < 0) {
                min = bd;
            }
        }
        System.out.print("max: " + max.setScale(2, RoundingMode.HALF_UP) + "\n");
        System.out.print("min: " + min.setScale(2, RoundingMode.HALF_UP) + "\n");
    }
}
