package com.subhra.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestJDBC {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	//Load Driver Class
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bithal","root","root");	//Create Connection
			
			PreparedStatement pst = con.prepareStatement("Select * from student");	//Prepare Statement
			ResultSet rs = pst.executeQuery();	//Execute Query and store result in ResultSet
			while(rs.next())	//Iterate through ResultSet
			{
				System.out.println("Name : "+rs.getString("name")+" & Roll No is : "+rs.getInt("roll"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
