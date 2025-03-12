package com.lee.self_practice.basic;

public class Array02 {
    public static void main(String[] args) {
        // 6(x)，100/hr
        // 4~6(o)，80/hr
        // 2~4(o)，50/hr
        // ~2(o)，30/hr
        park02();
    }

    static void park01() {
        int[] chargeList = new int[]{30, 50, 80, 100};
        int[] hourList = new int[]{0, 2, 4, 6};

        int hr = 1;
        int cost = 0;
        for (int i = 0; i<=hourList.length-1; i++) {
            if (hr-hourList[i] < 0) {
                break;
            }
            cost = cost + (hourList[i]+2)*chargeList[i];
//            for (int j = 0; j<=chargeList.length-1; j++) {
//                cost = cost + (hourList[i]+2)*chargeList[j];
//            }
        }
        System.out.println(cost);
        //int cost = (hr-hourList[(hourList.length)-1])*chargeList[chargeList.length-1];
    }

    static void park02() {
        int[] chargeList = new int[]{100, 80, 50, 30};
        int[] hourList = new int[]{6, 4, 2, 0};
        int hr = 1;
        int cost = 0;
        for (int i = 0; i <= hourList.length-1; i++) {
            if (hr < hourList[i]) {
                continue;
            }
            cost = cost + (hr - hourList[i])*chargeList[i];
            hr = hourList[i]; // 幹，太神啦，就這一行我想破頭
        }
        System.out.println(cost);
    }

}
