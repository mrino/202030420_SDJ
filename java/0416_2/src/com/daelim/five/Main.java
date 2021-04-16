package com.daelim.five;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
	// write your code here
        ArrayList<Animai> ani = null;
        ani = new ArrayList<>();

        Wolf wolf = new Wolf();
        Animai aninam1 = (Animai)wolf;
        ani.add(aninam1);

        Bear bear = new Bear();
        Animai aninam2 = (Animai)bear;
        ani.add(aninam2);

        Rabbit rabbit = new Rabbit();
        Animai aninam3 = (Animai)rabbit;
        ani.add(aninam3);

        Cow cow= new Cow();
        Animai aninam4 = (Animai)cow;
        ani.add(aninam4);


        for(int i = 0; i< ani.size();i++)
        {
            Animai list = ani.get(i);

            list.eat();
            list.work();

        }


    }
}
