package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con=null;
		Statement stmt=null;
		ResultSet res=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/nepti","root","992330");
		
//			stmt=con.createStatement();
//			
//			stmt.execute("create table employee(id int primary key,name varchar(20),city varchar(20),salary bigint)");
//			
//			System.out.println("Table created.");
			
			//Insert Data
//			stmt=con.createStatement();
//			
//			stmt.execute("insert into employee values(102,'Dhiraj Raskar','Saswad',20000);");
//			
//			System.out.println("Record Inserted Successfully,");
			
			//Update Data
//			stmt=con.createStatement();
//			
//			stmt.executeUpdate("update employee set salary=30000 where id=101");
//			
//			System.out.println("Record Updated Successfully.");
			
			//Delete Data
//			stmt=con.createStatement();
//			
//			stmt.executeUpdate("delete from employee where id=102;");
//			
//			System.out.println("Record Deleted Successfully.");
			
			stmt=con.createStatement();
			
			res=stmt.executeQuery("select * from employee;");
			
			while(res.next()) {
				System.out.println(res.getInt("id")+" "+res.getString("name")+" "+res.getString("city")+" "+res.getInt("salary"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
