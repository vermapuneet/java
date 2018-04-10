/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pro;

import com.main.Customer;
import com.main.Withdraw;

/**
 *
 * @author skverma
 */
public class B implements Withdraw {
        double balance;
	double amount;
    @Override
    public void withdraw(Customer c, double amount) {
                this.balance=c.getBalance();
		c.setBalance(this.balance=this.balance-amount);
    }
    
    
}
