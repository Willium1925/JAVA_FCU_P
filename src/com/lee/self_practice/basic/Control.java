package com.lee.self_practice.basic;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {

		/*int n = 1;
		int sum = 0;
		while(n<=100){
			sum = sum+n;
			n++;
		};
		System.out.println(sum);*/
		
		/*for(int x  = 0 ; x <= 5 ; x = x + 1) {
			System.out.println(x );
		};*/
		
		
		
		// 以下兩種，第一種是意外寫出來的，但把AI問倒了，沒有一個AI答對
		/*int sum02 = 0;
		for(int a = 1 ; a <= 10 ; sum02=sum02+a) {
			System.out.println(a);
			a++;
			//System.out.println(sum02);

		};
		System.out.println("sum02 = " + sum02);
		
		int sum03 = 0;
		for(int n3 = 1 ; n3 <= 10 ; n3++) {
			sum03=sum03+n3;
		};
		System.out.println("sum03 = " + sum03);
		*/
		
		
		
		// 用 for 迴圈印出 1 到 10。
		/*for(int n=1 ; n<=10 ; n++) {
			System.out.println(n);
		};*/
		
		
		// 用 while 迴圈印出 2、4、6、8、10。
		// 注意，不能寫nn<=10
		/*
		int nn = 0;
		while((nn%2==0) & (nn<10)) {
			nn=nn+2;
			System.out.println(nn);
		};*/
		
		// 輸入一個正整數 n，使用迴圈計算 1 + 2 + ... + n 的總和並輸出。
		int t = 0;
		t = t+1; //t=1
		t = t+1; //t=2
		System.out.println(t);
		
		int m = 1;
		int ttotal = 0;
		while(m<=10) {
			ttotal = ttotal+m;
			m++;
		}
		System.out.println(ttotal);
		
		System.out.println("請輸入最大數");
		Scanner s00 = new Scanner(System.in);
		int max = s00.nextInt();
		int mm = 1;
		int total = 0;
		while(mm<=max) {
			total=total+mm;
			mm++;
		}
		System.out.println("1~"+max+"的總和是"+total);
		s00.close();
		

	}

}
