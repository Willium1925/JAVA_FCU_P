package com.lee.self_practice.basic;

import java.util.Arrays;

public class Array04 {
    public static void main(String[] args) {
        // 模擬擲兩顆骰子，列出所有點數和的出現次數
        diceTest();
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
}
