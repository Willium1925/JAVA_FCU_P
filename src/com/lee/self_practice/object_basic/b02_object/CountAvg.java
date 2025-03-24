package com.lee.self_practice.object_basic.b02_object;

public class CountAvg {
    private int  a;
    private int  b;
    //private int[] intArray = new int[num];
    private int num;
    private int sum;

    private void add02() {
        sum = a+b;
    }

    //private void addxxx(int...array) {
    //    for (int i: array) {
    //        sum = sum + i;
    //    }
    //}

    private void addxxx(String strInt) {
        sum = 0;
        for (int i: toIntArray(strInt)) {
            sum = sum + i;
        }
    }

    private int[] toIntArray(String strInt) {
        String[] strIntArray = strInt.trim().split("\\s");
        int[] intArray = new int[strIntArray.length];
        for (int i = 0; i < strIntArray.length; i++) {
            intArray[i] = Integer.parseInt(strIntArray[i]);
        }
        return intArray;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSum() {
        add02();
        return sum;
    }

    public int getSum(String strInt) {
        addxxx(strInt);
        return sum;
    }

    // 建構子
    // 若你一開始任何建構子都沒寫，JAVA會自動幫妳寫一個不帶任何參數的建構子
    // 以這個類別來說就像這樣
    // CountAvg() {
    // }
    // 不做任何事，你也看不到，只在其他地方建立實例時(new)派上用場
    // 但若是你有需求，在其他地方建立實例時(new)，需要同時建立一些初始資料aka傳入參數，
    // 你就必須自己寫客製化的建構子aka帶參數的建構子
    // 此時如果你又希望保留乾淨的建構子，就需額外再寫，JAVA不會再幫你偷偷寫了
    // 而且
    // 預設情況(自動生成乾淨不做是的建構子)我們寫習慣了，以為"實例化"這件事就只是實例化，一行程式，沒有其他事情發生
    // 錯!!!
    // 要是寫成CountAvg() {System.out.print("surprise MDFK")}
    // 你在某個地方寫CountAvg cag = new CountAvg();時，
    // console區是會跑出山謬傑克森的!!!!!!!

    //CountAvg() {
    //}
    CountAvg() { System.out.println("surprise MDFK"); }
}
