package com.daelim.five;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
            System.out.println("test");
            Exception e = new Exception();
            throw e;

        }catch (Exception e) {
            System.out.println("ddd");
        }
        finally {
            System.out.println("finally");
        }
    }
}
