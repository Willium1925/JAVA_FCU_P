package com.lee.self_practice.object_basic.b01_method;

public class Recursive {
    public static void main(String[] args) {
        System.out.println(f(6));
    }

    static int f(int x) {
        if (x ==1) {
            return x;
        } else {
            return x*f(x-1);
        }
    }

}
