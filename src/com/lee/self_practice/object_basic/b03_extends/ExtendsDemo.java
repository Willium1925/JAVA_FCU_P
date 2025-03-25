package com.lee.self_practice.object_basic.b03_extends;

public class ExtendsDemo {

    public static void main(String[] args) {
        SonCMath sonCMath = new SonCMath();
        sonCMath.getMax(15, 43);
        sonCMath.getFactorial(5);

        GrandSonCMath grandSonCMath = new GrandSonCMath();
        grandSonCMath.getMax(15, 43); // 呼叫祖父類別的方法
        grandSonCMath.getFactorial(6);   // 呼叫父類別的方法
        grandSonCMath.getFabonacci(12);  // 呼叫自己的方法
    }

}

// 父類別 Superclass
// 一個父類別可以有多個子類別；一個子類別只能有一個父類別
class CMath {
    public void getMax(int a, int b) {
        int bigNum;
        if (a > b) {
            bigNum = a;
        } else {
            bigNum = b;
        }
    }
}

// 子類別 Subclass
class SonCMath extends CMath {
    public void getFactorial(int a) {
        int ans = 1;
        System.out.print(a + "! = ");
        for (int i = 1; i <= a; i++) {
            if (i == a) {
                System.out.print(i + " ");
            } else {
                System.out.print(i + "*");
            }
            ans = ans*i;
        }
        ans = ans*a;
        System.out.println("= " + ans);
    }
}

// 子類別(孫)
class GrandSonCMath extends SonCMath {  //GrandSonCMath繼承SonCMath類別
    public void getFabonacci(int a) {
        int firstNum = 0;
        int secondNum = 1;
        System.out.print("費氏數列:") ;
        System.out.print(firstNum + ", " + secondNum);
        int ans;
        for(int i=2; i<=a; i++) {
            ans = firstNum + secondNum;
            System.out.print(", " +ans);
            firstNum = secondNum;
            secondNum = ans;
        }
    }
}
