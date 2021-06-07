package com.company;
import java.util.*;
public class user {

    static mangmentGoods g = new mangmentGoods();

    static void userlogin() {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("---------------user login--------------------------");
            System.out.println("Please enter your username:");
            String user1 = sc.next();
            System.out.println("please enter your password:");
            int pwd1 = sc.nextInt();
            if(user1=="carfourx" || pwd1 ==85200147){
                System.out.println("Landed successfully!");
                g.login();
            }else{
                System.out.println("The username and password are incorrect, please re-enter:");

            }
            break;
        }
    }


}
