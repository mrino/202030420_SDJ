package com.daelim.five;

import java.util.HashMap;
import java.util.Scanner;

public class Screen{
    int i = 0;
    int num;
     Screen(){
        System.out.println("1.Login");
        System.out.println("2.Sign up");
         System.out.println("3.exit");
        Scanner s = new Scanner(System.in);
        try{
            String str = s.nextLine();
            num = Integer.parseInt(str);
            //로그인 하는 곳
            if(num == 1){
                Login log = new Login();
                log();

            }
            //가입하는 곳
            else if(num == 2){
                
            }
            //시스템 종료
            else if(num == 3){
                System.exit(0);
            }
            //나머지 숫자면 다시 입력하게 시키는 곳
            else{
                Exception e = new Exception();
                throw e;
            }

        }catch (Exception e){
            System.out.println("알맞은 숫자를 입력하세요");
        } finally {
            System.out.println("ㅇㄱㅇ");
        }
    }
}

