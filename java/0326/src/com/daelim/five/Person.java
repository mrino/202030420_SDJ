package com.daelim.five;

import java.util.Scanner;

public class Person {
    private int height;
    private int weight;
    private String name;
    private String phonenumber;

    Scanner s = new Scanner(System.in);


    public Person()
    {
        this.height = 0;
        this.weight = 0;
        this.name = "";
        this.phonenumber = "";
    }

    public Person(int height, int weight, String name, String phonenumber)
    {
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.phonenumber = phonenumber;
    }

    public void eat()
    {
        weight += 1;
    }


    public void printpersno()
    {
        String s = "학생 정보 ";
        s += "키: " + this.height;
        s += ", 무게: " + this.weight;
        s += ", 이름: " + this.name;
        s += ", 전화번호: " + this.phonenumber;
        System.out.println(s);


    }
}
