package com.example.lib;

public class MyClass {
    public static void main(String[] avg){
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);
        System.out.println("請輸入時間:");
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        if(h>=8 && h<=17)
            System.out.println("現在是上課時間!");
        else if(h==7) {
            if (m >= 30)
                System.out.println("現在是上課時間!");
            else
                System.out.println("現在不是上課時間");
        }
        else
            System.out.println("現在不是上課時間");
    }
}
