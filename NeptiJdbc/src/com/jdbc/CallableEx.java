package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con=null;
	    CallableStatement ctmt=null;
	    
	    try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/nepti","root","992330");
		
			ctmt=con.prepareCall("call idev()");
			ctmt.execute();
			System.out.println("Record INserted.");
	    
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

}
