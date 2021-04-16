package com.daelim.five;

public class Wolf extends Animai{

    public String Aniname;
    @Override
    public void eat() {
        System.out.print("늑대는 고기를 먹습니다. ");
    }


    void work() {
        System.out.println("4발로 걸어 다닙니다.");
    }
}
