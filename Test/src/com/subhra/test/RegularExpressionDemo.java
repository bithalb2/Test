package com.subhra.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pattern pattern = Pattern.compile("[a-zA-Z0-9_%+-.]+@[a-zA-Z0-9]+[\\.[a-zA-Z]+]+");
		//Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		
		System.out.print("Enter the String : ");
		
		String input = sc.next();
		sc.close();
		
		Matcher matcher = pattern.matcher(input);
		
		if(matcher.find() && matcher.group().equals(input)) {
			System.out.println(matcher.group());
			System.out.println("Valid Email ID ...");
		} else {
			System.out.println("NOT a valid Email ID ...");
		}
	}

}
