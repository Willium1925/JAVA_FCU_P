package com.lee.lesson_sample.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo_0306 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 固定寫法
        System.out.println(br.read()); // 只會讀取一個字元，並且會回傳該字元的 Unicode 數值 (即 ASCII 或 UTF-16 編碼)
        System.out.println(br.readLine());



    }
}
