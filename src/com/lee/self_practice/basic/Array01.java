package com.lee.self_practice.basic;

import java.util.Arrays; // 重要！

public class Array01 {
    // 來源
    // https://yubin551.gitbook.io/java-note/basic_java_programming/datatype/array

    public static void main(String[] args) {
        ImportantPleaseSee();
//        MemoryCheck();
//        ArrayMethods();
    }

    static void ImportantPleaseSee() {
        int[] a = {10, 20, 30};
        int[] b = {10, 20, 30};
        int[] c = a;
        a[0] = 999;
        // 參考資料型別跟基本資料型別最大不同
        // 回想起stack和heap區儲存的差別
        // int[] c = a; 這裏，指定運算aka賦值，實際上是給予“指向的記憶體位置”，不像int c = a的結果等同是直接賦值
        // 因此不論之後對a和c做任何操作，都是影響到heap中的同一物件
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(c));

        // 可以隨時更換指向，不用顧慮啥
        b = c; // 註解看看下一行有何變化
        System.out.println(Arrays.equals(a, b));
    }

    static  void MemoryCheck() {
        int[] score = new int[]{50, 60, 60, 80};
        System.out.println(score[1] == score[2]);
        System.out.println(Arrays.toString(score));

        int[][] score02 = new int[][]{{10, 20}, {20, 30}, {10, 20},{30, 40}};
        //System.out.println((score02[0]).getClass);
    }

    static void ArrayMethods() {
        int[] array00 = { 1, 1, 2, 3, 5, 8, 13 };
        System.out.println(Arrays.toString(array00));

        // 快速的複製一個一模一樣的資料的陣列物件，與原陣列佔用不同記憶體，彼此獨立。
        int[] array01 = { 1, 1, 2, 3, 5, 8, 13 };
        int[] arrayClo=array01.clone();
        array01[0]=555;
        System.out.println(Arrays.toString(array01));
        System.out.println(Arrays.toString(arrayClo));

        // Arrays.fill(Object[],value)
        // 可以把陣列全部用value填滿，常用於陣列初始化。
        int[] arrayFill = new int[10];
        System.out.println(Arrays.toString(arrayFill));
        Arrays.fill(arrayFill, -1);  // 以 -1 填滿 arrayFill
        System.out.println(Arrays.toString(arrayFill));

        // 陣列排序 Arrays.sort(Object[])
        // 這個方法超美妙的，可以把陣列從小排到大
        // 內部實做是快速排序法(quick sort)，時間複雜度 O(NlogN)，
        // 比較的機制是該物件的 .compareTo()方法，實做上可以省掉很多寫排序演算法的時間。
        int[] array03 = {50,1,-999,6000,77,3,50,0};
        System.out.println(Arrays.toString(array03));
        Arrays.sort(array03);
        System.out.println(Arrays.toString(array03));

        // 陣列搜尋 Arrays.binarySearch(Object[],key)
        // 利用binarySearch搜尋陣列中目標key的索引值，
        // 時間複雜度為O(logN)，如果找不到回傳小於0的整數。
        // 因為是用binarySearch實做，所以陣列『必須已排序好(遞增)』。
        int[] array04 = {50,1,-999,6000,77,3,50,0};
        System.out.println(Arrays.toString(array04));
        Arrays.sort(array04);
        System.out.println(Arrays.toString(array04));
        System.out.println(Arrays.binarySearch(array04, 77));
        System.out.println(Arrays.binarySearch(array04, 2000));

        // 陣列相等 Arrays.equals(Object[],Object[])
        // 相等的條件：每個陣列元素的值、順序都完全一樣，
        // 若 reference 指到同一物件視為相等，都為 null 也視為相等。
        int[] arrayA = { 5, 6, 7 };
        int[] arrayB = arrayA.clone();
        System.out.println(Arrays.equals(arrayA, arrayB));
        arrayA[0] = 1;
        System.out.println(Arrays.equals(arrayA, arrayB)); // arrayA變成{1,6,7}，arrayB還是{5,6,7}，不相等
        arrayA = arrayB;
        System.out.println(Arrays.equals(arrayA, arrayB));
        arrayA = null;
        arrayB = null;
        System.out.println(Arrays.equals(arrayA, arrayB));
    }
}

