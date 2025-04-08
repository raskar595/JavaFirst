package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con=null;
		PreparedStatement ptmt=null;
		ResultSet res=null;
		Scanner sc=new Scanner(System.in);
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/nepti","root","992330");
		

			int flag=1;
			
			while(flag!=0) {
				
				System.out.println("1.Insert Data");
				System.out.println("2.Update Data");
				System.out.println("3.Delete Data");
				System.out.println("4.Retrive Data");
				System.out.println("5.Exit");
				
				System.out.println("Enter your Choice: ");
				int choice=sc.nextInt();
				
				switch (choice) {
				case 1: {
					
					ptmt=con.prepareStatement("insert into developer(name,city,salary) values(?,?,?);");
					
					System.out.println("Enter your Name: ");
					String name=sc.next();
					ptmt.setString(1, name);
					

					System.out.println("Enter your City: ");
					String city=sc.next();
					ptmt.setString(2,city);

					System.out.println("Enter your Salary: ");
					int salary=sc.nextInt();
					ptmt.setInt(3, salary);
					
					ptmt.execute();
					
					System.out.println("Record Inserted.");
					
					break;
				}
				case 2: {
					
					ptmt=con.prepareStatement("update developer set city=? where id=?");
					
					
					//update
					System.out.println("Enter the ID to Update the Record: ");
					int id=sc.nextInt();
					ptmt.setInt(2, id);
					
		
					System.out.println("Enter your City: ");
					String city=sc.next();
					ptmt.setString(1, city);
					
					ptmt.executeUpdate();
					
					System.out.println("Record Updated Successfully.");
					
					break;
				}
				case 3: {
					
					ptmt=con.prepareStatement("delete from developer where id=?");
					
					
					System.out.println("Enter the ID to Delete the Record: ");
					int id=sc.nextInt();
					ptmt.setInt(1, id);
					
		
					ptmt.executeUpdate();
					
					System.out.println("Record Deleted Successfully.");
					
					break;
				}
				case 4: {
					
					ptmt=con.prepareStatement("select * from developer;");
					res=ptmt.executeQuery();
					
					while(res.next()) {
						System.out.println(res.getInt("id")+" "+res.getString("name")+" "+res.getString("city")+" "+res.getInt("salary"));
					}
					
					break;
				}
				case 5: {
					flag=0;
					continue;
				}
				default:{
					System.out.println("Invalid Input.");
				}
				
				}
				
				System.out.println("Do you want to continue...yes...or...no");
				String str=sc.next();
				
				if(str.equals("yes")) {
					
				}
				else {
					flag=0;
				}
				
			}
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.err.println("Application has been closed.....!");

	}

}
