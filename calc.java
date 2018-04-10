package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

public class calc{

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textFieldans;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(204, 51, 51));
		frame.getContentPane().setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(146, 11, 135, 51);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(311, 11, 113, 51);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JButton btnNewButton = new JButton("add");
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,num3;
				try{
					num1=Integer.parseInt(textField1.getText());
					num2=Integer.parseInt(textField2.getText());
					num3=num1 + num2;
					textFieldans.setText(Integer.toString(num3));
				}
				catch(Exception e1)
				{
					
					JOptionPane.showMessageDialog(null, "enter number");
				}
				
				
				
				
			}
		});
		btnNewButton.setBounds(33, 90, 96, 51);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("minus");
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int num1,num2,num3;
				try{
					num1=Integer.parseInt(textField1.getText());
					num2=Integer.parseInt(textField2.getText());
					num3=num1 - num2;
					textFieldans.setText(Integer.toString(num3));
				}
				catch(Exception e1)
				{
					
					JOptionPane.showMessageDialog(null, "enter number");
				}
				
		
				
			}
		});
		btnNewButton_1.setBounds(175, 90, 73, 51);
		frame.getContentPane().add(btnNewButton_1);
		
		textFieldans = new JTextField();
		textFieldans.setBounds(210, 185, 176, 65);
		frame.getContentPane().add(textFieldans);
		textFieldans.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("answer is");
		lblNewLabel.setBackground(SystemColor.windowBorder);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(55, 185, 145, 36);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton_2 = new JButton("product");
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1,num2,num3;
				try{
					num1=Integer.parseInt(textField1.getText());
					num2=Integer.parseInt(textField2.getText());
					num3=num1 * num2;
					textFieldans.setText(Integer.toString(num3));
				}
				catch(Exception e1)
				{
					
					JOptionPane.showMessageDialog(null, "enter number");
				}
				
				
				
				
				
				
				
			}
		});
		btnNewButton_2.setBounds(268, 90, 81, 51);
		frame.getContentPane().add(btnNewButton_2);
		frame.setBounds(100, 100, 486, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
