package com.jdbc;
import java.sql.*;


public class Main {

	public static void main(String[] args) throws Exception{
		
		String query="select * from student where id=2";
		String quer1="insert into student (name,id) values('robin','65');";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Connection con=DriverManager.getConnection(url,uname,pass);
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","demo","newuser@123");  
		
		  Statement stam=con.createStatement();
		  ResultSet res=stam.executeQuery(query);
			/*
			 * while(res.next()) {
			 * 
			 * String val=res.getString("name"); String val1=res.getString("id");
			 * System.out.println(val+ " "+val1); }
			 */
		  res.next();
			String vald=res.getString(1);
			String vald1=res.getString(2);
			System.out.println(vald +" "+ vald1);
			stam.close();
			res.close();
			System.out.println("---------------------");
			//System.out.println(res.getInt(1));
			
	}

}
