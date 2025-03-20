package com.lee.lesson_sample.basic;

import java.util.Scanner;

public class Check_0699_Final {
    public static void main(String[] args) {
        // 計算3的倍數總和
        //timeSumOfThree();
        // 計算2個整數間的所有整數之和
        //sumBetween();
        // 用*輸出矩形
        //rectangleWithStars();
        // 用*輸出菱形
        //diamondWithStars();
        //diamondWithStarsAns();
        //diamondWithStarsAns02();
        //diamondWithStarsMine();
        //diamondWithStarsMine02();
        // 密碼檢查程式
        //passwordCheck();
        passwordCheck02();
    }

    // 指定範圍內，指定數的所有倍數和
    static void timeSumOfThree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入數字，將計算該數所有倍數之和");
        int num = sc.nextInt();
        System.out.println("請輸入上限");
        int max = sc.nextInt();
        long sum = 0;
        for (int i = num; i <= max; i = i+num) {
            sum = sum + i;
        }
        System.out.println("0到" + max + "所有" + num + "的倍數，其總和為:" + sum);
    }

    // 計算指定兩數間所有整數之和
    static void sumBetween() { //5 0 再測試
        Scanner sc = new Scanner(System.in);
        System.out.println("將計算指定兩數間所有整數之和");
        System.out.println("請指定起始數");
        int min = sc.nextInt();
        System.out.println("請指定終點數");
        int max = sc.nextInt();
        long sum = 0;
        long sum02 = 0;
        for (int i = min; i <= max; i++) {
            sum = sum + i;
        }
        sum02 = (max + min)*(max-min+1)/2;
        System.out.println(min + "到" + max + "之間所有整數之和為:" + sum);
        System.out.println(min + "到" + max + "之間所有整數之和為:" + sum02);
    }

    // 輸出指定空心長方形
    static void rectangleWithStars() {
        int heigh = 5;
        int wideth = 10;
        for (int h = 1; h <= heigh; h++) {
            if (h == 1 || h == heigh) { // 上邊緣跟下邊緣
                for (int w = 1; w <= wideth; w++) {
                    System.out.print("x ");
                }
                System.out.println();
            } else { // 左邊緣跟右邊緣
                System.out.print("x ");
                for (int w = 2; w < wideth; w++) {
                    System.out.print("  ");
                }
                System.out.println("x ");
            }
        }
    }

    // 輸出菱形
    static void diamondWithStars() {
    /*
       x    4
      xxx   345
     xxxxx  23456
    xxxxxxx 1234567
     */
        int insert = 4;
        if (insert%2 == 0) {

        } else {
            int max = insert+(insert-1);
            for (int i = 1; i <= max; i++) {
                if (i == (1+max)/2) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    static void diamondWithStarsAns() {
        int size = 6;
        if (size % 2 == 0) {
            size++; // 计算菱形大小
        }
        for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = size / 2 + 1; j > i + 1; j--) {
                System.out.print(" "); // 输出左上角位置的空白
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*"); // 输出菱形上半部边缘
            }
            System.out.println(); // 换行
        }
        for (int i = size / 2 + 1; i < size; i++) {
            for (int j = 0; j < i - size / 2; j++) {
                System.out.print(" "); // 输出菱形左下角空白
            }
            for (int j = 0; j < 2 * size - 1 - 2 * i; j++) {
                System.out.print("*"); // 输出菱形下半部边缘
            }
            System.out.println(); // 换行
        }
    }

    static void diamondWithStarsAns02() {
        int num = 5;// 行数
        // 上半部分菱形，外層循環控制
        for (int i = 1; i <= num; i++) {
            // 内層循環控制
            // 填充空白格
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // 三角形中心列及左半邊
            for (int k = 1; k <= i; k++) {
                System.out.print(k); // 輸出
            }
            // 三角形右半邊
            for (int n = i - 1; n >= 1; n--) {
                System.out.print(n); // 輸出
            }
            // 換行
            System.out.println();
        }
        // 下半部分菱形，外層循環控制
        for (int i = 1; i < num; i++) {
            // 内層循環控制
            // 填充空白格
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // 三角形中心列及左半邊
            for (int k = 1; k <= num - i; k++) {
                System.out.print(k); // 輸出
            }
            // 三角形右半邊
            for (int n = num - 1 - i; n > 0; n--) {
                System.out.print(n); // 輸出
            }
            // 換行
            System.out.println();
        }
    }

    // 高度不等於星星數
    static void diamondWithStarsMine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("請指定菱形高度");
        int height = sc.nextInt();
        for (int i = 1; i <= height; i++) {
            // left spaces
            for (int spaceL = 1; spaceL <= (height-i); spaceL++) {
                System.out.print(" ");
            }
            // medium
            for (int mediumm = 1; mediumm <= 1+(i-1)*2; mediumm++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = height-1; i >= 1; i--) {
            // left spaces
            for (int spaceL = 1; spaceL <= (height-i); spaceL++) {
                System.out.print(" ");
            }
            // medium
            for (int mediumm = 1; mediumm <= 1+(i-1)*2; mediumm++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 高度等於星星數
    static void diamondWithStarsMine02() {
        /*

            x.   |   s4 x1
           x x.  |   s3 x1 s1 x1
          x x x. |   s2 x1 s1 x1 s1 x1
         x x x x |.  s1
        x x x x x|

        */
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for (int i = 1; i <= height; i++) {
            // 左邊空格
            for (int spa = 1; spa <= height-i; spa++) {
                System.out.print(" ");
            }
            // 中間＊號
            for (int s = 1; s <= i; s++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = height-1; i >= 1; i--) {
            // 左邊空格
            for (int spa = 1; spa <= height-i; spa++) {
                System.out.print(" ");
            }
            // 中間＊號
            for (int s = 1; s <= i; s++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    // 密碼驗證，4~8位，須包含數字和英文
    static void passwordCheck() {
        /*
        0~9 48~57
        A~Z 65~90
        a~z 97~122
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入密碼，4~8位，須包含數字和英文");

        while (true) {
            String password = sc.nextLine();
            boolean longEnough = false;
            boolean hasNum = false;
            boolean hasEngBig = false;
            boolean hasEngLittle = false;
            boolean allGood = true;

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (c >= '0' && c <= '9') {
                    hasNum = true;
                }
                if (c >= 'A' && c <= 'Z') {
                    hasEngBig = true;
                }
                if (c >= 'a' && c <= 'z') {
                    hasEngLittle = true;
                }
            }
            if (password.length() >= 4 && password.length() <= 8) {
                longEnough = true;
            }
            System.out.println(hasNum);
            System.out.println(hasEngBig);
            System.out.println(hasEngLittle);
            if (!hasNum) {
                System.out.print("沒有數字!");
                allGood = false;
            }
            if (!hasEngBig) {
                System.out.print("沒有大寫字母!");
                allGood = false;
            }
            if (!hasEngLittle) {
                System.out.print("沒有小寫字母!");
                allGood = false;
            }
            if (!longEnough) {
                System.out.println(password.length() <4? "太短了!": "太長了");
                allGood = false;
            }
            if (allGood) {
                System.out.println("密碼格式正確");
            } else {
                System.out.println("請重新輸入");
                //sc.nextLine(); // 如果把password放進while迴圈哩，這段就不用打
                // 但其實也必須把password放進while迴圈哩
                // 若不放在迴圈裡，就無法更新每次重新輸入的密碼
                continue;
            }
            System.out.println("請再次輸入密碼驗證");
            String passwordCheck = sc.nextLine();
            if (passwordCheck.equals(password)) {
                System.out.println("驗證完了，再見");
                break;
            } else {
                System.out.println("密碼不一致，請重新設定");
                //sc.nextLine();
            }
        }

    }

    // 密碼驗證，4~8位，須包含數字和英文，最後重複輸入驗證（３次幾會）
    // 同樣的數字和字母不能出現２次以上
    static void passwordCheck02() {
        /*
        0~9 48~57
        A~Z 65~90
        a~z 97~122
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入密碼，4~8位，須包含數字和大小寫英文");

        while (true) {
            String password = sc.nextLine();
            boolean longEnough = false;
            boolean hasNum = false;
            boolean hasEngBig = false;
            boolean hasEngLittle = false;
            boolean allGood = true;

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (c >= '0' && c <= '9') {
                    hasNum = true;
                }
                if (c >= 'A' && c <= 'Z') {
                    hasEngBig = true;
                }
                if (c >= 'a' && c <= 'z') {
                    hasEngLittle = true;
                }
            }
            if (password.length() >= 4 && password.length() <= 8) {
                longEnough = true;
            }
            System.out.println(hasNum);
            System.out.println(hasEngBig);
            System.out.println(hasEngLittle);
            if (!hasNum) {
                System.out.print("沒有數字!");
                allGood = false;
            }
            if (!hasEngBig) {
                System.out.print("沒有大寫字母!");
                allGood = false;
            }
            if (!hasEngLittle) {
                System.out.print("沒有小寫字母!");
                allGood = false;
            }
            if (!longEnough) {
                System.out.println(password.length() <4? "太短了!": "太長了");
                allGood = false;
            }
            if (allGood) {
                System.out.println("密碼格式正確");
            } else {
                System.out.println("請重新輸入");
                //sc.nextLine(); // 如果把password放進while迴圈哩，這段就不用打
                // 但其實也必須把password放進while迴圈哩
                // 若不放在迴圈裡，就無法更新每次重新輸入的密碼
                continue;
            }
            System.out.println("請再次輸入密碼驗證");
            int count = 1;
            boolean isMatch = false;
            while (count <= 3) {
                String passwordCheck = sc.nextLine();
                if (passwordCheck.equals(password)) {
                    System.out.println("驗證成功，再見!");
                    isMatch = true;
                    break;
                } else {
                    System.out.println("密碼不一致!");
                    count++;
                }
            }
            if (isMatch) {
                break;
            } else {
                System.out.println("錯誤三次，請重新設定密碼");
            }
        }
    }
}
