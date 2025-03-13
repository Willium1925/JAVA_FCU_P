package com.lee.self_practice.basic;

import java.util.Arrays;

public class Array03_Bubble {
    public static void main(String[] args) {
        //forEachTest();
        //bubbleTest();
        //bubbleTest02();
        bubbleTest03();
    }

    static  void forEachTest() {
        int[] temp = new int[]{10, 50, 68, 49, 36, 51, 78};
        for (int i : temp) {
            System.out.println(i); // 是i，不是temp[i]
        }
    }

    static void bubbleTest() {
        int[] temp = new int[]{10, 50, 68, 49, 36, 51, 78};
        for (int i : temp) {
            if (i > i+1) {
                int a = i;
                int b = i+1;
                temp[i+1] = a;
                temp[i] = b;
                System.out.println("這是第" + i+1 + "次排列："+ Arrays.toString(temp));
            }
        }
    }

    static void bubbleTest02() {
        int[] temp = new int[]{4, 3, 2, 1};
        int count = 1;
        // 內層迴圈的條件永遠是 j < temp.length - 1，
        // 這代表每一輪外層迴圈，都會從頭比到倒數第二個，這樣確實會「慢慢把大的值往右邊推」，
        // 但因為你沒有隨著外層 i 的次數，逐步減少內層的比對次數，所以每次都在做多餘的檢查。
        for (int i = 0; i <temp.length-1; i++) {
            for (int j = 0; j < temp.length-1; j++) {
                if (temp[j] > temp[j+1]) {
                    int a = temp[j];
                    int b = temp[j+1];
                    temp[j+1] = a;
                    temp[j] = b;
                    // 我把print打在這，那當然每次印出的結果只會是向右推一次
                    System.out.println("這是第" + count + "次排列："+ Arrays.toString(temp));
                    count++;
                }
            }
        }
    }

    static void bubbleTest03() {
        int[] temp = new int[]{4, 3, 2, 1};
        int count = 1;
        for (int i = 0; i <temp.length-1; i++) {
            for (int j = 0; j < temp.length-1-i; j++) {
                if (temp[j] > temp[j+1]) {
                    int big = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = big;
                }
            }
            System.out.println("這是第" + count + "次排列："+ Arrays.toString(temp));
            count++;
        }
    }

}
