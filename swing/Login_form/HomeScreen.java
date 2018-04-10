
package com.hello;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class HomeScreen extends JFrame{
     JPanel panel;
     JLabel l1;
   public  HomeScreen()
    {
        panel=new JPanel();
    panel.setBounds(20, 20, 360, 300);
    //panel.setBackground(Color.red);
    panel.setLayout(null);
   
    
    addcomponent();
    panel.add(l1);
    add(panel);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setSize(600,500);
    setTitle("Home screen");
        
    }
    private void addcomponent()
    {
        l1=new JLabel("welcome");
        l1.setBounds(250, 2, 100, 200);
        
    }
    
}
