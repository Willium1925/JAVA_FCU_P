package com.lee.lesson_sample.object_basic.lessonQuession;

import java.util.Arrays;
import java.util.Scanner;

// 遊戲規則，另立class
public class Captain_Hook {
    public static void main(String[] args) {
        Hook hook = new Hook();
        System.out.println(Arrays.toString(hook.getAns()));
        Scanner scanner = new Scanner(System.in);
        System.out.println("虎克船長啟動，有十個洞，你有五次機會");

        while (hook.getCount() > 0 && hook.isBoom() == false) {
            System.out.println("你想插第幾個洞？(1~10)");
            // 轉成對應index值
            int userInsert = scanner.nextInt()-1;
            System.out.println(hook.attack(userInsert));
        }
        if (hook.isBoom() == false) {
            System.out.println("虎克船長還活著，可惜～～～");
        }
    }
}

class Hook {
    private boolean[] ans = new boolean[10];
    private int count = 5;
    private boolean isBoom = false;

    public Hook() {
        // 隨機設一個洞為true
        int a = (int)(Math.random()*10);
        ans[a] = true;
    }

    String attack(int i) {
        if (ans[i] == false) {
            this.count--;
            return "沒中！安全！你還有" + count + "次機會！";
        } else {
            this.isBoom = true;
            return "BOOOOOMMMMMM!!!!!!虎克起飛!!!!!!!";
        }
    }

    public boolean[] getAns() {
        return ans;
    }

    public int getCount() {
        return count;
    }

    public boolean isBoom() {
        return isBoom;
    }
}
