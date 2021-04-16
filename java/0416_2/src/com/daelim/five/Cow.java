package com.daelim.five;

public class Cow extends Animai
{
    public String Aniname;
    @Override
    public void eat() {
        System.out.print("소는 풀을 먹습니다. ");
    }


    void work() {
        System.out.println("4발로 걸어 다닙니다.");
    }
}
