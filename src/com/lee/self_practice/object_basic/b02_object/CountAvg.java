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


}
