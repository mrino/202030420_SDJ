package com.daelim.five;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
	// write your code here
        ArrayList<Animai> ani = null;
        ani = new ArrayList<>();

        Wolf wolf = new Wolf();
        Animai aninam = (Animai)wolf;
        ani.add(aninam);

        Bear bear = new Bear();
        aninam = (Animai)bear;
        ani.add(aninam);

        Rabbit rabbit = new Rabbit();
        aninam = (Animai)rabbit;
        ani.add(aninam);

        Cow cow= new Cow();
        aninam = (Animai)cow;
        ani.add(aninam);


        for(int i = 0; i< ani.size();i++)
        {
            Animai list = ani.get(i);

            list.eat();
            list.work();

        }


    }
}
