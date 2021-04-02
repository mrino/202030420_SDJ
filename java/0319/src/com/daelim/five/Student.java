package com.daelim.five;

public class Student {

    private String name;
    private String  phone;
    private String wjsrhd;
    private int    cls;
    private String email;
    private String brith;
    private String id;

    public Student(String name, String phone){
        this.name = name;
        this.phone = phone;
        this.wjsrhd = "";
        this.cls = 0;
        this.email = "";
        this.brith = "";
        this.id = "";
    }
    public Student(String name, String phone, String wjsrhd, int cls, String email, String brith, String id){
        this.name = name;
        this.phone = phone;
        this.wjsrhd = wjsrhd;
        this.cls = cls;
        this.email = email;
        this.brith = brith;
        this.id = id;
    }



    public void print() {
        String print = "";
        print += "이름 :" + name;
        print += ", 전화번호 :" + phone;
        print += ", 전공 :" + wjsrhd;
        print += ", 학년 :" + cls;
        print += ", 이메일 :" + email;
        print += ", 생일 :" + brith;
        print += ", 주소 :" + id;

        System.out.println(print);
    }

}
