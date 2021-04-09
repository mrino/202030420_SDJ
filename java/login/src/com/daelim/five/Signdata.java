package com.daelim.five;

import java.util.HashMap;


public class Signdata extends Screen{
    Setting setting = new Setting();
    HashMap<String, String> id = new HashMap<String, String>();

    Signdata(){
        System.out.println("1");
        id.put("test","1234");

    }
}
