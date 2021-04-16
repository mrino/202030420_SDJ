package com.daelim.five;

public class Bear  extends Animai{
    public String Aniname;
    @Override
    public void eat() {
        System.out.print("곰은 고기를 먹습니다. ");
    }


    void work() {
        System.out.println("곰은 4발로 걸어 다닙니다");
    }

}
