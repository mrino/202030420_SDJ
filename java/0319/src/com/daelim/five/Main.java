package com.daelim.five;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        //값이 문자열인지 아닌지 확인.
        boolean flag = str.chars().allMatch(Character::isDigit);
        int num = Integer.parseInt(str);

        if (flag) {
            for (int i = 0; i <= num; i++) {
                for (int l = 0; l < i; l++) {
                    System.out.print("*");
                }
                System.out.println("");
            }

            for (int i = num; i >= 0; i--) {
                for (int l = i; l > 0; l--) {
                    System.out.print("*");

                }
                System.out.println("");
            }
        }
        
    }
}