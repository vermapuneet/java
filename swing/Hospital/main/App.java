/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import com.admin.AdminScreenMain;
import javax.swing.SwingUtilities;

/**
 *
 * @author skverma
 */
public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){

   public void run()
  {
        new AdminScreenMain();
      
  }
  
} );       
    }
    
}
