package com.lee.self_practice.basic;

import java.util.Scanner;

public class Control_advanced01 {

	public static void main(String[] args) {
		// 使用巢狀迴圈印出 1 到 9 的九九乘法表。
		for(int x=1 ;x <=9 ; x++) {
			for(int y=1 ; y <= 9 ; y++) {
				System.out.println(x+"乘"+y+"="+(x*y));
			}
		}
		for(int xx=1 ;xx <=9 ; xx++) {
			for(int yy=1 ; yy <= 9 ; yy++) {
				System.out.print(xx+"乘"+yy+"="+(xx*yy) + "\t");
			}
			System.out.println();
		}

		// 輸入一個數 n，用迴圈計算 n!（即 n * (n-1) * (n-2) * ... * 1）。
		// 不要被侷限，可以反向思考，其實等於n*(n+1)*(n+2).....
		int n = 10;
		int sum = 1;
		while(n>=1) {
			sum = sum*n;
			n=n-1;
		}
		System.out.println(sum);
		
		System.out.println("請輸入階層乘法的最高位");
		Scanner s = new Scanner(System.in);
		int max = s.nextInt();
		int summ = 1;
		for(int nn = 0 ; nn<max ; nn++) {
			sum = sum*(max-nn);
		}
		System.out.println(sum);
		
		
	}

}
