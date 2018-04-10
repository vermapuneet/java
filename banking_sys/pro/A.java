/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pro;

import com.main.Customer;
import com.main.Deposit;

/**
 *
 * @author skverma
 */
public class A implements Deposit
{       double balance;
	double amount;
	//Customer c;

    @Override
    public void deposit(Customer c, double amount)
    {
             this.balance=c.getBalance();
             this.balance=this.balance+amount;
	      c.setBalance(balance);
    }

    
    
 }
    

