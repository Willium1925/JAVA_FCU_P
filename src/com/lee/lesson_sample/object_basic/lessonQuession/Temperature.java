package com.lee.lesson_sample.object_basic.lessonQuession;

// ℉＝℃×9÷5＋32
// (f-32)*5/9
class Main {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        System.out.println(temperature.toC(25.6));
        System.out.println(temperature.toF(25.6));
    }
}

public class Temperature {
    double toC(double f) {
        return (f-32)*5/9;
    }

    double toF(double c) {
        return c*9/5+32;
    }
}
