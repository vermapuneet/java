/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import com.pro.A;
import com.pro.B;
import java.util.Scanner;

/**
 *
 * @author puneet verma
 */
public class App {
   
    public static void main(String[] args) {
        int amount;
        Customer c=new Customer("puneet",10000);
          
System.out.println("The initial balance is :" + c.getName());
System.out.println("The initial balance is :" + c.getBalance());
  Scanner in=new Scanner(System.in);
 
      System.out.println("select option");
      System.out.println("1.enter amount to deposit");
      System.out.println("1.enter amount to withdraw");
     int op=in.nextInt();
     switch(op)
           {
               case 1: A a=new A();
      System.out.println("1.enter amount to deposit");
       amount=in.nextInt();
      a.deposit(c, amount);
      System.out.println("The final balance is :"+c.getBalance());  
               break;
               
            case 2:
                 B b=new B();
       System.out.println("1.enter amount to withdraw");  
          amount=in.nextInt();
          b.withdraw(c, amount);

       System.out.println("The final balance is :"+c.getBalance());  
          break;
       default:
           System.out.println("pls select option");
          
     }
    
    }
}
