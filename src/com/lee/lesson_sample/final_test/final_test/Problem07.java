package com.lee.lesson_sample.final_test.final_test;

import java.util.Scanner;

// 讀取⼀四位數，並且依下列⽅式進⾏加密
//1. 以該位數加7後，除以 10 取餘數取代該位數
//2. 將第⼀個位數的數字與第三個位數的數字對調
//3. 將第⼆個位數的數字與第四個位數的數字對調
// Input
//輸⼊⼀個四位數的數字(int)。
//Output
//輸出加密後的數，最後必須有換⾏字元。
//1234   0189
//4567   3412
//7891   6845
public class Problem07 {
    public static void main(String[] args) {
        teat01();
    }

    static void teat01() {
        Scanner sc = new Scanner(System.in);
        int insert = sc.nextInt();

        String str = String.valueOf(insert);
        String[] strArray = str.split("");

        int[] encrypt = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            encrypt[i] = (Integer.parseInt(strArray[i])+7)%10;
        }
        int temp = encrypt[0];
        encrypt[0] = encrypt[2];
        encrypt[2] = temp;
        temp = encrypt[1];
        encrypt[1] = encrypt[3];
        encrypt[3] = temp;

        for (int i = 0; i < encrypt.length; i++) {
            System.out.print(encrypt[i]);
        }
        System.out.println();
    }

}
