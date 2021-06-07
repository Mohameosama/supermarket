package com.company;
import java.util.*;


public class test {
    static void login() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("----------------Supermarket Management System!--------------------------");
            System.out.println("Please enter the number: 1 to login enter any number to exit");
            try {//Exception capture
                int menue = sc.nextInt();
                if (menue == 1) {
                    user.userlogin();//log in
                } else {
                    System.out.println("Thanks for using!");
                    break;
                }
            } catch (Exception e) {
                System.out.println("input error!");
            }
        }
    }
}
