package com.daelim.five;

public class Main {

    public static void main(String[] args) {

        System.out.println(add(1,2));
        System.out.println(add(3,4,4));

    }

    static int add(int a,int b)
    {
        return a+b;
    }

    static int add(int a,int b,int c)
    {
        int v = a+b+c;
        return v;
    }
}
