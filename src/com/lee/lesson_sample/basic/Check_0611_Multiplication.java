package com.lee.lesson_sample.basic;

public class Check_0611_Multiplication {
    public static void main(String[] args) {
//        doWhile();
//        normalWhile();
        multiplication99();
    }

    static void doWhile() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    static void normalWhile() {
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    static void multiplication99() {
        // 不要用'\t'，統一使用"\t"才安全
        // '\t' 是一個特殊的字元（tab 符號），它的 ASCII 值是 9
        // 除非左側是字串，'\t'才會被判斷成tab
        for (int i = 1; i <= 9; i++) {
            //System.out.print(i + '\t');
            //System.out.print(i + "\t");
            for (int j = 1; j <= 9; j++) {
                if (j*i >= 25) {
                    continue;
                }
                System.out.print(j + "乘" + i + "等於" + j*i + "\t");
            }
            System.out.println();
        }
    }
}
