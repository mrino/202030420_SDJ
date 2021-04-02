package com.daelim.five;

import java.util.Locale;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String number = "1234567890";
        String eng = "abcdefghijklmnopqrstuvwyz";
        String ENG = eng.toUpperCase();

        System.out.println(eng.substring(12,13)+eng.substring(23,24)+" "+eng.substring(13,14)+eng.substring(0,1)+eng.substring(12,13)+eng.substring(4,5)+" "
                +eng.substring(8,9)+eng.substring(18,19)+" "
                +ENG.substring(18,19)+eng.substring(7,8)+eng.substring(8,9)+eng.substring(13,14)+" "
                +ENG.substring(3,4)+eng.substring(14,15)+eng.substring(13,14)+eng.substring(6,7)+ " "
                +ENG.substring(9,10)+eng.substring(20,21));
        System.out.println("today is "+number.substring(1,2)+number.substring(9,10)+number.substring(1,2)+number.substring(0,1)
                +number.substring(9,10)+number.substring(2,3)+number.substring(1,2)+number.substring(5,6));


    }
}
