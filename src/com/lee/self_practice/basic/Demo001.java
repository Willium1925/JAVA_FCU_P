package com.lee.self_practice.basic;


import java.util.Scanner;

public class Demo001 {

	public static void main(String[] args) {
/*		int x = 5;
		int y = x++ + ++x;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
*/
		byte b1 = (byte) 10;
		byte b2 = (byte) 20;
		//byte b3 = b1 + b2;  // ⚠️ 編譯錯誤：Type mismatch: cannot convert from int to byte
		//System.out.println(b3);

		testxx();
	}

	static void testxx() {
		// 宣告累加值 sum, 計算範圍 range, 迴圈變數 i
		int sum = 0, range, i;
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入欲計算的奇數和範圍 (結尾數值)：");
		//range = sc.nextInt();
		while(!sc.hasNextInt()) {
			System.out.print("請輸入整數：");
			sc.next();
		}
		range = sc.nextInt();
		// 由 1 開始, 每次加 2 直到 i 值大於 range 的 for 迴圈
		for (i=1; i<=range; i+=2) { // 每跑一次迴圈就將 i 值加 2
			sum += i;
		}
		System.out.println("1 到 "+range+" 的所有奇數和為 "+sum);
	}

}
