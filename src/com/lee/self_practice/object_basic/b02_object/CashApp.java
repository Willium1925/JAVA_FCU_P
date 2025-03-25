package com.lee.self_practice.object_basic.b02_object;

public class CashApp {
    public static void main(String[] args) {
        CashCard cashCard01 = new CashCard("a001", 500, 1);
        CashCard cashCard02 = new CashCard("a002", 1000, 2);
        CashCard cashCard03 = new CashCard("a003", 2000, 4);

        CashCard[] cashCards = new CashCard[]{
                                                new CashCard("a001", 500, 1),
                                                new CashCard("a002", 1000, 2),
                                                new CashCard("a003", 2000, 4)
                                                };


    }
}
