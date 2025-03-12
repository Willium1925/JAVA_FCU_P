package com.lee.self_practice.basic;

import java.util.Arrays; // 重要！

public class Array01 {
    public static void main(String[] args) {
    MemoryCheck();

    }

    static  void MemoryCheck() {
        int[] score = new int[]{50, 60, 60, 80};
        System.out.println(score[1] == score[2]);
        System.out.println(Arrays.toString(score));

        int[][] score02 = new int[][]{{10, 20}, {20, 30}, {10, 20},{30, 40}};
        //System.out.println((score02[0]).getClass);
    }
}
