package com.lee.self_practice.object_basic.b03_extends;

public class ConstructorExtend {
    public static void main(String[] args) {
        new Cube();            // 採匿名物件的方式來建立物件實體
    }
}

class Line {
    protected int leng = 5;     // 長度　
    Line() {
        System.out.println("祖父，直線長度 = " + leng);
    }
}

class Rectangle extends Line {
    protected int wide = 4;     // 寬度
    Rectangle() {
        System.out.println("老爸，矩形面積 = " + (leng * wide));
    }
}

class Cube extends Rectangle {
    protected int high = 3;     // 高度
    Cube() {
        System.out.println("兒子，立方體體積 = " + (leng * wide * high));
    }
}
