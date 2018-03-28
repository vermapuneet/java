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
 * @author skverma
 */
public class Customer  {
    private String name;
    private double balance;
    private double amount;
    Scanner input=new Scanner(System.in);
       
    Customer(String name,double d)
    {
        this.name=name;
        this.balance=d;
    }

    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
     void deposit()
     {
         System.out.println("enter the amount to deposit");
         this.amount=input.nextInt();
        
     }
     void withdraw() 
     {
	  System.out.println("Enter the amount to withdraw");
	  Scanner sc=new Scanner(System.in);
          this.amount=sc.nextInt();
                      
  
       }
     
}