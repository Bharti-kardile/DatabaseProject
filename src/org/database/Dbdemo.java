package org.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Dbdemo {
	public static void main(String arg[])throws Exception
	{
	Class.forName("org.postgresql.Driver");
	Connection con=DriverManager.getConnection("Jdbc:postgresql://localhost/abc","postgres","root");
	Statement st=con.createStatement();
	int k=st.executeUpdate("insert into emp values(101,'om',5000");
	if(k>=1)
		System.out.println("record insert");
	else
		System.out.println("error ");
	st.close();
	con.close();
	
}
}