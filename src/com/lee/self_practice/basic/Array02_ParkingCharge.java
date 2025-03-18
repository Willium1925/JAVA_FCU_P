package com.lee.self_practice.basic;

import java.util.Scanner;

public class Array02_ParkingCharge {
    public static void main(String[] args) {
        // 停車級距收費
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

        Scanner sc = new Scanner(System.in);
        System.out.println("輸入停車時數");
        double hourD = sc.nextDouble();
        // 可以，但能更簡潔
        //BigDecimal hourBig = new BigDecimal(hourD).setScale(0, BigDecimal.ROUND_HALF_UP);
        //int hr = Integer.parseInt(hourBig.toString());
        int hourInt = (int)Math.round(hourD);

        int cost = 0;
        for (int i = 0; i <= hourList.length-1; i++) {
            if (hourInt < hourList[i]) {
                continue;
            }
            cost = cost + (hourInt - hourList[i])*chargeList[i];
            hourInt = hourList[i]; // 幹，太神啦，就這一行我想破頭
        }
        System.out.println(cost);
    }

}
