package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreaparedStmtEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con=null;
		PreparedStatement ptmt=null;
		ResultSet res=null;
		Scanner sc=new Scanner(System.in);
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/nepti","root","992330");
		
			ptmt=con.prepareStatement("insert into employee values(?,?,?,?);");
			
			System.out.println("Enter your ID: ");
			int id=sc.nextInt();
			ptmt.setInt(1, id);
			
			System.out.println("Enter your Name: ");
			String name=sc.next();
			ptmt.setString(2, name);
			

			System.out.println("Enter your City: ");
			String city=sc.next();
			ptmt.setString(3,city);

			System.out.println("Enter your Salary: ");
			int salary=sc.nextInt();
			ptmt.setInt(4, salary);
			
			ptmt.execute();
			
			System.out.println("Record Inserted.");

//			ptmt=con.prepareStatement("update employee set city=? where id=?");
//			
			
			//update
//			System.out.println("Enter the ID to Update the Record: ");
//			int id=sc.nextInt();
//			ptmt.setInt(2, id);
//			
//
//			System.out.println("Enter your City: ");
//			String city=sc.next();
//			ptmt.setString(1, city);
//			
//			ptmt.executeUpdate();
//			
//			System.out.println("Record Updated Successfully.");
//			
			
//		ptmt=con.prepareStatement("delete from employee where id=?");
//			
//			
//			System.out.println("Enter the ID to Delete the Record: ");
//			int id=sc.nextInt();
//			ptmt.setInt(1, id);
//			
//
//			ptmt.executeUpdate();
//			
//			System.out.println("Record Deleted Successfully.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
