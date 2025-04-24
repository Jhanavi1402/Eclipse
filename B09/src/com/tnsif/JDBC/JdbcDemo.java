package com.tnsif.JDBC;
import java.sql.*;//2nd step

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:postgresql://localhost:5432/JDBCDEMO";//db url
		String username="postgres";//username of db
		String password = "1497";//db password
		
		try {
			//load the driver - 3rd step
			Class.forName("org.postgresql.Driver");
			
			//Establishing the connection - 4th step
			//connection interface
			Connection con=DriverManager.getConnection(url,username,password);
			
			//Define  SQL Query -5th step
			Statement st= con.createStatement();
			
			//executing the query -6th step
			String query = "SELECT * FROM employee";
			
			//Process the Result - 7th step
			ResultSet rs= st.executeQuery(query);
			
			while(rs.next())
			{
				String table =rs.getString(1) + ":"+ rs.getInt(2);
				System.out.println(table);
			}
			
			//close the resources -8th
			rs.close();
			st.close();
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
