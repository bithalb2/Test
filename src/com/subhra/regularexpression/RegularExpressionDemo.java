package com.subhra.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("(0|91)?[6-9][0-9]{9}");
		
		Matcher matcher = pattern.matcher(args[0]);
		
		if(matcher.find() && matcher.group().equals(args[0])) {
			System.out.println("Valid Mobile Number");
		} else {
			System.out.println("NOT a valid Mobile Number");
		}

	}

}
