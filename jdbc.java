package tt;
import java.io.IOException;
import java.sql.*;
public class jdbc {

	public static void main(String[] args) throws Exception {
	try {
		
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin://@localhost:1521:xe","system","puneet");
		Statement st=con.createStatement();
		String sql="select * from p";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ " " + rs.getString(2));
			
		}
		con.close();
	
	}
	catch(Exception e)
	{
			System.out.print(e);
	}

	}

}
