package com.lee.lesson_sample.basic;

import java.util.Arrays;

public class Check_0799_Final {
    public static void main(String[] args) {
        diceTestThree();
    }

    // 擲三個骰子，統計各種點數和出現的機率
    static void diceTestThree() {
        // 3~18 16種可能，－３剛好等於索引值
        int[] sumCount = new int[16];
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                for (int k = 1; k <= 6; k++) {
                    sumCount[i+j+k-3]++;
                }
            }
        }
        for (int s: sumCount) {
            System.out.println(s);
        }
        // 非常重要！！！！！常常呼略！！！！
        // 整數除以整數，回想起來，會得到什麼？
        // 沒錯！！！整數！！！而且小數點全部省略！！！！！
        // 所以下面這段全部無駄だ!!!!!!!!!
        for (int s: sumCount) {
            System.out.println(s/216);
        }
        // 真的要顯示小數點就至少朝這方向修改
//        System.out.println(Arrays.toString(sumCount));
//        for (int i = 3; i <=18; i++) {
//            System.out.println("點數和為" + i + "的機率為：" + (double)sumCount[i-3]/216);
//        }
        System.out.println(Arrays.toString(sumCount));
        for (int i = 3; i <=18; i++) {
            System.out.println("點數和為" + i + "的機率為：" + sumCount[i-3] + "/" +216);
        }

    }
}
