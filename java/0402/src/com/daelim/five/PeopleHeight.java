package com.daelim.five;

public class PeopleHeight{

    private int Hegiht;

    public PeopleHeight()
    {
        this.Hegiht = 175;
    }

    public PeopleHeight(int Height)
    {
        this.Hegiht = Height;
    }

    public void getHeight()
    {
        System.out.println("키는 "+Hegiht+"cm 입니다.");

    }
}
