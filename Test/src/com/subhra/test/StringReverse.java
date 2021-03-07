package com.subhra.test;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		StringBuffer str = new StringBuffer(sc.nextLine());
		
		sc.close();
		
		StringBuffer result = new StringBuffer("");
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			result.append(str.charAt(i));
		}
	
		System.out.println(result);
	}

}
