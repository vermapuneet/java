package com.jdbc;
import java.sql.*;


public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/demo?verifyServerCertificate=false&useSSL=true";
		String uname="root";
		String pass="puneet@12345";
	  
		String query="select * from student";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		
		  Statement stam=con.createStatement();
		  ResultSet res=stam.executeQuery(query);
		  res.next(); String val=res.getString("name"); System.out.println(val);
		 
			
	}

}
