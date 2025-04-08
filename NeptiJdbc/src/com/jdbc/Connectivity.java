package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/nepti","root","992330");
		
			if(con==null) {
				System.out.println("Connection is Not Established.");
			}
			else {
				System.out.println("Connection is Established.");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
