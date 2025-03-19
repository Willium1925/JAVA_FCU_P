package com.lee.self_practice.basic;

import java.util.Arrays;

public class Array04_Dice {
    public static void main(String[] args) {
        // 模擬擲兩顆骰子，列出所有點數和的出現次數
        //diceTest();
        diceTest02();
        diceCheck();
    }

    static void diceTest() { // 可行，只是可以更好
        int[] dice01 = new int[]{1, 2, 3, 4, 5, 6};
        int[] dice02 = dice01.clone();
        int[] sumList = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] sumCount = new int[11];
        Arrays.fill(sumCount, 0);
        System.out.println(Arrays.toString(sumCount));

        for (int k : dice01) {
            for (int i : dice02) {
                for (int s = 0; s < sumList.length; s++) {
                    if (k + i == sumList[s]) {
                        sumCount[s]++;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(sumCount));
    }

    static void diceTest02() {
        //{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12} 11種可能
        //{0, 1, 2, 3, 4, 5, 6, 7,  8,  9, 10} 對應索引值
        int[] sumCount = new int[11];
        for (int i = 1; i <=6 ; i++) { // 骰子一
            for (int j = 1; j <= 6; j++) { // 骰子二
                // i+j-2 剛好就能對應索引值
                sumCount[i+j-2]++;
            }
        }
        System.out.println(Arrays.toString(sumCount));
    }

    static void diceCheck() {
        int[] dice01 = new int[]{1, 2, 3, 4, 5, 6};
        int[] dice02 = dice01.clone();
        int[] sum = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] sumCount = new int[11];

        for (int i: dice01) {
            for (int j:dice02) {
                for (int s: sum) {
                    if (i+j == s) {
                        sumCount[s-2]++;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(sumCount));
    }
}
