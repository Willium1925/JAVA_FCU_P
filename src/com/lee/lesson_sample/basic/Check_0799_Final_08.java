package com.lee.lesson_sample.basic;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Check_0799_Final_08 {
    // 輸入任意個數的數值，排序這些數
    public static void main(String[] args) {
        problem08();
    }

    static void problem08() {
        //BigDecimal a = new BigDecimal(10);
        //BigDecimal b = new BigDecimal(20);
        //BigDecimal c = new BigDecimal(10);
        //System.out.println(a.compareTo(b)); // 當前對象a < 參考對象b，會輸出 -1
        //System.out.println(b.compareTo(a)); // 當前對象b > 參考對象a，會輸出  1
        //System.out.println(a.compareTo(c)); // 當前對象a = 參考對象c，會輸出  0

        int count = 0;
        String strAllInsert = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入任意個數之數字，輸入end結束輸入");

        while (true) {
            System.out.println("請輸入第" + (count+1) + "個數");
            String strInsert = sc.next();
            if (strInsert.equals("end")) {
                break;
            } else {
                strAllInsert = strAllInsert + strInsert + " ";
                count++;
            }
        }
        // 這裡若添加1，意思是"分成一個"，若是2，意思是"分成二個"
        // 寫1等於沒意義，因為分成一個等於不用分
        // 所以要碼正確輸入要java分的等分要求，例如我這裡就應該是count，不然就別寫，等同有遇到空白就分
        // 啊如果改成\\s+，遇到多長的空白和tab都視為一個分隔，更安全，避免使用者輸入多個空白
        //String[] str = strAllInsert.trim().split("\\s", 1);
        String[] strAllInsertArray = strAllInsert.trim().split("\\s+");
        BigDecimal[] bigInsertArray = new BigDecimal[strAllInsertArray.length];

        for (int i = 0; i < strAllInsertArray.length; i++) {
            bigInsertArray[i] = new BigDecimal(strAllInsertArray[i]);
        }

        System.out.println("總輸入轉成的字串陣列:" + "\n"+ Arrays.toString(strAllInsertArray));
        System.out.println("字串陣列再轉成BIG陣列:" + "\n"+ Arrays.toString(bigInsertArray));

        // 將得到的BigDecimal陣列行泡沫排序
        for (int i =0; i < bigInsertArray.length-1; i++) {
            for (int j = 0; j < bigInsertArray.length-1-i; j++) {
                if (bigInsertArray[j].compareTo(bigInsertArray[j+1]) == 1) {
                    BigDecimal temp = bigInsertArray[j];
                    bigInsertArray[j] = bigInsertArray[j+1];
                    bigInsertArray[j+1] = temp;
                }
            }
        }
        System.out.println("最終完成排序的BIG陣列:" + "\n"+ Arrays.toString(bigInsertArray));
    }
}
