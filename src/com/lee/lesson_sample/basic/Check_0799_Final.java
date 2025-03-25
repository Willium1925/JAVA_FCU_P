package com.lee.lesson_sample.basic;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Check_0799_Final {
    public static void main(String[] args) {
        //diceTestThree();
        //reverseTest();
//        reverseTest02();
        //exchanging();
        //exchanging02();
        //exchanging03();
        //isPrimeReview();
        //isPrimeWithArrays();
        //isPrimeWithArraysAns();
        //problem09();
        problem09V02();
    }

    // 擲三個骰子，統計各種點數和出現的機率
    static void diceTestThree() {
        // 3~18 16種可能，－３剛好等於索引值
        int[] sumCount = new int[16];
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                for (int k = 1; k <= 6; k++) {
                    sumCount[i + j + k - 3]++;
                }
            }
        }
        for (int s : sumCount) {
            System.out.println(s);
        }
        // 非常重要！！！！！常常呼略！！！！
        // 整數除以整數，回想起來，會得到什麼？
        // 沒錯！！！整數！！！而且小數點全部省略！！！！！
        // 所以下面這段全部無駄だ!!!!!!!!!
        for (int s : sumCount) {
            System.out.println(s / 216);
        }
        // 真的要顯示小數點就至少朝這方向修改
//        System.out.println(Arrays.toString(sumCount));
//        for (int i = 3; i <=18; i++) {
//            System.out.println("點數和為" + i + "的機率為：" + (double)sumCount[i-3]/216);
//        }
        System.out.println(Arrays.toString(sumCount));
        for (int i = 3; i <= 18; i++) {
            System.out.println("點數和為" + i + "的機率為：" + sumCount[i - 3] + "/" + 216);
        }

    }

    // 反転冲动
    static void reverseTest() {
        // 錯誤寫法！
        //char[] orig = new char[]{a, b, c, d, e, f, g};
        //String[] origS = new String[]{a, b, c, d, e, f, g};

        // 正確
        char[] orig = new char[]{'a', 'b', 'c', 'd'};
        char[] rev = new char[orig.length];
        System.out.println(Arrays.toString(orig));
        for (int i = orig.length - 1; i >= 0; i--) {
            rev[(orig.length - 1) - i] = orig[i];
        }
        System.out.println(Arrays.toString(rev));
    }

    // 反転冲动02
    // 修正直接輸入ＥＮＤ會報錯
    static void reverseTest02() {
        int count = 0;
        String strAllInsert = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入任意個數之整數(若有空白會視為區隔，請注意)，輸入end結束輸入");
        while (true) {
            System.out.println("請輸入第" + (count+1) + "個數");
            String strInsert = sc.nextLine();
            try {
                int temp = Integer.parseInt(strInsert);
            } catch (NumberFormatException e) {
                System.out.println("請正確輸入整數！");
                continue;
            }
            if (strInsert.equals("end")) {
                if (count == 0) {
                    System.out.println("您未輸入任何內容，請確實輸入！");
                    continue;
                }
                break;
            } else {
                //System.out.println(Arrays.toString(strInsert.split("\\s+")));
                String[] strInsertArray = strInsert.trim().split("\\s+");
                System.out.print("您已輸入第 ");
                for (String s: strInsertArray) {
                    strAllInsert = strAllInsert + s + " ";
                    count++;
                    System.out.print(count + " ");
                }
                System.out.print("個數，");
            }
        }

        String[] strAllInsertArray = strAllInsert.trim().split("\\s+");
        int[] intInsertArray = new int[strAllInsertArray.length];
        int[] intInsertArrayRev = new int[intInsertArray.length];

        for (int i = 0; i < strAllInsertArray.length; i++) {
            intInsertArray[i] = Integer.parseInt(strAllInsertArray[i]);
        }

        for (int i = intInsertArray.length - 1; i >= 0; i--) {
            intInsertArrayRev[(intInsertArray.length - 1) - i] = intInsertArray[i];
        }
        System.out.println("總輸入轉成的字串陣列:" + "\n"+ Arrays.toString(strAllInsertArray));
        System.out.println("字串陣列再轉成int陣列:" + "\n"+ Arrays.toString(intInsertArray));
        System.out.println("最終完成反轉int陣列:" + "\n"+ Arrays.toString(intInsertArrayRev));
    }

    // 意外測出一些東西，關於string對char的特殊待遇
    static void exchanging() {
        char[] c = new char[]{'a', 'b', 'c', 'd'};
        String strC = Arrays.toString(c);
        System.out.println("純陣列c：" + c);
        System.out.println("字串化c：" + strC);
        char[] c2 = strC.toCharArray();
        System.out.println("純陣列c2：" + c2);

        System.out.println();

        char[] d = new char[]{'a', 'b', 'c', 'd'};
        String strD = Arrays.toString(d);
        System.out.println(d);
        System.out.println(strD);
        char[] d2 = strD.toCharArray();
        System.out.println(d2);

        System.out.println();

        char[] e = new char[]{'a', 'b', 'c', 'd'};
        String strE = new String(e);
        System.out.println(e);
        System.out.println(strE);
        char[] e2 = strE.toCharArray();
        System.out.println(e2);
    }

    // 意外測出一些東西，關於string對char的特殊待遇，之二
    static void exchanging02() {
        int[] numA = new int[]{1, 2, 3, 4};
        String strNumA = Arrays.toString(numA);
        System.out.println("純陣列c：" + numA);
        System.out.println("字串化c：" + strNumA);
        char[] numA2 = strNumA.toCharArray();
        System.out.println("純陣列c2：" + numA2);

        System.out.println();

        int[] numB = new int[]{1, 2, 3, 4};
        String strNumB = Arrays.toString(numB);
        System.out.println(numB);
        System.out.println(strNumB);
        char[] numB2 = strNumB.toCharArray();
        System.out.println(numB2);

        System.out.println();

//        int[] numC = new int[]{1, 2, 3, 4};
//        String strNumC = new String(numC);
//        System.out.println(numC);
//        System.out.println(strNumC);
//        char[] numC2 = strNumC.toCharArray();
//        System.out.println(numC2);
    }

    // 請撰寫一個程式，宣告2個陣列變數a與b，分別指向擁有同樣個數元素的陣列，並且將a中元素依據b中對應位置的元素值來調換位置。
    // 舉例來說，如果a 與b的內容如下：
    // 陣列 a：20, 30, 40, 50
    // 陣列 b：1, 3, 0, 2
    // 就是要將a改成：a[1]=20, a[3]=30, a[0]=40, a[2]=50
    // 您的程式必須將陣列a的內容更改為：
    // 40,20,50,30
    static void exchanging03() {
        int[] a = new int[]{45, 27, 93, 14, 65};
        System.out.println(Arrays.toString(a));
        int[] b = new int[]{4, 2, 0, 1, 3};
        int[] temp = new int[a.length];
        int j = 0;
        for (int i: a) {
           temp[j] = a[b[j]];
           j++;
        }
        a = temp;
        System.out.println(Arrays.toString(a));
    }

    static void isPrimeReview() {
        int max = 20;
        for (int i = 2; i <= max; i++) { // 要被檢查的數字們
            boolean isPrime = true;
            for (int j = 2; j*j < i; j++) { // 拿來除的數字們
                if (i == 2) {
                    break;
                }
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }

    // 透過索引碼代表實際數字，列出指定範圍內的所有質數
    static void isPrimeWithArrays() {
        Scanner sc = new Scanner(System.in);
        System.out.println("請指定數字，將列出1至該數內所有質數");

        int max = sc.nextInt();
        boolean[] isPrimeArray = new boolean[max+1]; // 輸入5，索引碼是01234，對使用者來說會無法檢測到5

        Arrays.fill(isPrimeArray, true); // 先假設都是質數



        // 假設到50
        //2 4 6 8 10 12 14...2*24 2*25
        //3 6 9 12...3*15 3*16
        //4 8 12...4*11 4*12
        //
        //48*1
        //49*1
        //50*1

        //for (int x = 2; x*x < max; x++) {
        //    for (int y = 2; )
        //    isPrimeArray[]
        //}


        for (int i = 2; i <= isPrimeArray.length; i++) {
            for (int j = 2; j*i < max; j++) {
                isPrimeArray[i*j] = false;
            }
            if (isPrimeArray[i]) {
                System.out.println(i);
            }
        }

    }

    static void isPrimeWithArraysAns() {
        Scanner sc = new Scanner(System.in);
        System.out.println("請指定數字，將列出 1 至該數內所有質數：");
        int max = sc.nextInt();

        boolean[] isPrimeArray = new boolean[max + 1]; // 索引代表實際數字，從 0 到 max
        Arrays.fill(isPrimeArray, true); // 全部先假設是質數

        // 0 和 1 不是質數，先標成 false
        isPrimeArray[0] = false;
        isPrimeArray[1] = false;

        // 篩法主體邏輯
        for (int i = 2; i * i <= max; i++) {
            if (isPrimeArray[i]) {
                // 將 i 的倍數全部標成 false
                for (int j = i * i; j <= max; j += i) {
                    isPrimeArray[j] = false;
                }
            }
        }

        // 印出所有是 true 的索引（就是質數）
        for (int i = 2; i <= max; i++) {
            if (isPrimeArray[i]) {
                System.out.println(i);
            }
        }
    }

    // 輸入任意陣列，找出陣列中是否有元素質等於該元素的索引值
    // 修正了一開始就end會報錯的bug，增加了是數值的檢查，但一次性輸入失效了
    static void problem09() {
        int count = 0;
        String strAllInsert = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入任意個數之數字(若有空白會視為區隔，請注意)，輸入end結束輸入");
        while (true) {
            System.out.println("請輸入第" + (count+1) + "個數");
            String strInsert = sc.nextLine();
            if (strInsert.equals("end")) {
                if (count == 0) {
                    System.out.println("您未輸入任何內容，請確實輸入！");
                    continue;
                }
                break;
            } else {
                try {
                    double temp = Double.parseDouble(strInsert);
                } catch (NumberFormatException e) {
                    System.out.println("請正確輸入數字！");
                    continue;
                }
                //System.out.println(Arrays.toString(strInsert.split("\\s+")));
                String[] strInsertArray = strInsert.split("\\s+");
                System.out.print("您已輸入第 ");
                for (String s: strInsertArray) {
                    strAllInsert = strAllInsert + s + " ";
                    count++;
                    System.out.print(count + " ");
                }
                System.out.print("個數，");
            }
        }
        String[] strAllInsertArray = strAllInsert.trim().split("\\s+");
        BigDecimal[] bigInsertArray = new BigDecimal[strAllInsertArray.length];
        for (int i = 0; i < strAllInsertArray.length; i++) {
            bigInsertArray[i] = new BigDecimal(strAllInsertArray[i]);
        }
        System.out.println("總輸入轉成的字串陣列:" + "\n"+ Arrays.toString(strAllInsertArray));
        System.out.println("字串陣列再轉成BIG陣列:" + "\n"+ Arrays.toString(bigInsertArray));

        boolean hasAns = false;
        for (int i = 0; i < bigInsertArray.length; i++) {
            try {
                int temp = bigInsertArray[i].intValueExact();
                if (temp == i) {
                    hasAns = true;
                    System.out.println("第" + (i+1) + "個元素其值為" + bigInsertArray[i] + "，剛剛好等於他的索引值" + i + "！");
                }
            } catch (ArithmeticException _) {
                continue;
            }
        }
        if (!hasAns) {
            System.out.println("哎呀沒有符合的結果～");
        } else {
            System.out.println("恭喜！再見！");
        }
    }

    // 嘗試修改中...
    static void problem09V02() {
        int count = 0;
        String strAllInsert = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入任意個數之數字(若有空白會視為區隔，請注意)，輸入end結束輸入");
        while (true) {
            System.out.println("請輸入第" + (count+1) + "個數");
            String strInsert = sc.nextLine();
            if (strInsert.equals("end")) {
                if (count == 0) {
                    System.out.println("您未輸入任何內容，請確實輸入！");
                    continue;
                }
                break;
            } else {
                String[] strInsertArray = strInsert.split("\\s+");
                for (int i = 0; i < strInsertArray.length; i++) {
                    try {
                        count++;
                        double temp = Double.parseDouble(strInsertArray[i]);
                    } catch (NumberFormatException e) {
                        System.out.println("第" + count + "個數:" + strInsertArray[i] + "格式錯誤，請正確輸入數字！");
                        count--;
                        break;
                    }
                    strAllInsert = strAllInsert + strInsertArray[i] + " ";
                    //System.out.print(count + " ");
                }
                System.out.print("您已輸入第 ");
                for (int c = 1; c <=count; c++) {
                    System.out.print(c + " ");
                }
                System.out.print("個數，");
                //System.out.println(Arrays.toString(strInsert.split("\\s+")));
            }
        }
        String[] strAllInsertArray = strAllInsert.trim().split("\\s+");
        BigDecimal[] bigInsertArray = new BigDecimal[strAllInsertArray.length];
        for (int i = 0; i < strAllInsertArray.length; i++) {
            bigInsertArray[i] = new BigDecimal(strAllInsertArray[i]);
        }
        System.out.println("總輸入轉成的字串陣列:" + "\n"+ Arrays.toString(strAllInsertArray));
        System.out.println("字串陣列再轉成BIG陣列:" + "\n"+ Arrays.toString(bigInsertArray));

        for (int i = 0; i < bigInsertArray.length; i++) {
            try {
                int temp = bigInsertArray[i].intValueExact();
                if (temp == i) {
                    System.out.println("第" + (i+1) + "個元素其值為" + bigInsertArray[i] + "，剛剛好等於他的索引值" + i + "！");
                }
            } catch (ArithmeticException _) {
                continue;
            }
        }
    }
}