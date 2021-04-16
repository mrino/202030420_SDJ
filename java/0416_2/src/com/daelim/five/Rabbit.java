package com.daelim.five;

public class Rabbit extends Animai{
    public String Aniname;
    @Override
    public void eat() {
        System.out.print("토끼는 당근를 먹습니다. ");
    }


    void work() {
        System.out.println("토끼는 2발로 걸어 다닙니다");
    }
}
