package com.daelim.five;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Circle c = null;
	    try {
	        int a  = 1/0;
           c.draw();

        } catch (Exception e){
            System.out.println("Excption 발생"+e.getMessage());
        } finally {
            System.out.println("종료됨");
        }

    }
}
