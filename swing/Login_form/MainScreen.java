
package com.hello;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainScreen extends JFrame implements ActionListener{
    JPanel panel;
    JLabel lbl1,lbl2,lbl3;
    JTextField txt1,txt2;
    JButton btn1,btn2;
   
    
    
    public MainScreen()
    {
    panel=new JPanel();
    panel.setBounds(20, 20, 360, 300);
    //panel.setBackground(Color.red);
    panel.setLayout(null);
    
    
   
    addcomponenet();
    panel.add(lbl3);
    panel.add(txt1);
    panel.add(lbl1);
    panel.add(lbl2);
    panel.add(txt2);
    panel.add(btn1);
    add(panel);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setSize(500,500);
    setTitle("hello world");
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String username,password;
        username=txt1.getText();
        password=txt2.getText();
        if(username.equals("admin") && password.equals("123"))
        {
      //  lbl3.setText(" welcome " + username);
            HomeScreen hs=new HomeScreen();
            this.setVisible(false);
            hs=null;
        }
        else
        {
              lbl3.setText("INVALID PASSWORD,PLS TRY AGAIN");
           
              }
        }

    private void addcomponenet() {
    lbl1=new JLabel("Enter Username:");
    lbl1.setBounds(50, 50,150,40); 
    
   
    txt1=new JTextField(15);
    txt1.setBounds(210, 50, 150, 40);
    
    
     lbl2=new JLabel("Enter Password:");
     lbl2.setBounds(50 ,120,150,40); 
     
     txt2=new JPasswordField(20);
     txt2.setBounds(210, 120, 150, 40);
    
    
    btn1=new JButton("LOGIN");
    btn1.setBounds(180, 250, 90, 40);
    btn1.addActionListener(this);
    lbl3=new JLabel("");
    lbl3.setBounds(180, 300, 200, 40);
    }
}
