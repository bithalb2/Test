package com.subhra.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestJDBC {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bithal","root","root");
			
			PreparedStatement pst = con.prepareStatement("Select * from student");
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				System.out.println("Name : "+rs.getString("name")+" & Roll No is : "+rs.getInt("roll"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
