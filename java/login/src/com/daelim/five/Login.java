package com.daelim.five;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login extends Signdata{
    public Login()
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String str1 = s.nextLine();

        if(id.containsKey(id)){
            if(id.get(str).contentEquals(str1))
            {
                System.out.println("확인중");
            }
        }

    }
}
