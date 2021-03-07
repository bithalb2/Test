package com.subhra.other;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Stack;

/*
 * Should not use 
 * javax.xml.* or 
 * org.w3c.* or 
 * org.jsoup.* or 
 * java.util.stream.* or 
 * java.util.regex.* or
 * html dom element libraries or
 * Pattern, matcher or any
 * other such libraries 
 * You should find the logic from scratch
 */

public class Task1 {

	public static void main(String[] args) throws IOException {

		/*
		 * The task does not require Javascript, HTML, XML, etc...
		 */

		//Download htmlFile.txt from mail and don't copy paste the file content.
		String givenString = new String(Files.readAllBytes(Paths.get("htmlFile.txt")));
		givenString = givenString.replaceAll("\\t","");
		givenString = givenString.replaceAll("\\r","");
		givenString = givenString.replaceAll("\\n","");
		
		System.out.println("Given String:");
		System.out.println(givenString);

		System.out.println("\nOutput for append:");
		System.out.println(append(givenString, "6", "<img id=\"appendSample2\" />"));

		System.out.println("\nOutput for prepend:");
		System.out.println(prepend(givenString, "10", "<br id=\"prependSample2\" />"));

		System.out.println("\nOutput for after:");
		System.out.println(after(givenString, "7", "<div id=\"afterSample2\"></div>"));

		System.out.println("\nOutput for before:");
		System.out.println(before(givenString, "13", "<span id=\"beforeSample2\"></span>"));
	}

	public static String append(String givenString, String id, String stringToAdd) {

		String outputString = "";
		
		Stack<String> stack = new Stack<String>();
		
		String[] ss = givenString.split(">");
		
		for(int i = 0; i < ss.length; i++)
			ss[i] += ">";
		
		for(String s : ss) {
			if(s.charAt(s.length() - 2) != '/') {
				if(s.charAt(1) != '/') {
					stack.push(s);
					outputString += s;
				} else {
					String temp = stack.pop();
					String[] sub = temp.split("\"");
					if(sub[1].equals(id)) {
						outputString += stringToAdd;
						outputString += s;
					} else {
						outputString += s;
					}
				}
			} else {
				String[] sub = s.split("\"");
				if(sub[1].equals(id)) {
					outputString += stringToAdd;
					outputString += s;
				} else {
					outputString += s;
				}
			}
		}

		return outputString;
	}

	public static String prepend(String givenString, String id, String stringToAdd) {

		String outputString = "";

		String[] ss = givenString.split(">");
		
		for(int i = 0; i < ss.length; i++)
			ss[i] += ">";
		
		for(String s : ss) {
			if(!s.contains("\"")) {
				outputString += s;
			} else {
				String[] sub = s.split("\"");
				if(sub[1].equals(id)) {
					outputString += s;
					outputString += stringToAdd;
				} else {
					outputString += s;
				}
			}
		}

		return outputString;
	}

	public static String after(String givenString, String id, String stringToAdd) {

		String outputString = "";

Stack<String> stack = new Stack<String>();
		
		String[] ss = givenString.split(">");
		
		for(int i = 0; i < ss.length; i++)
			ss[i] += ">";
		
		for(String s : ss) {
			if(s.charAt(s.length() - 2) != '/') {
				if(s.charAt(1) != '/') {
					stack.push(s);
					outputString += s;
				} else {
					String temp = stack.pop();
					String[] sub = temp.split("\"");
					if(sub[1].equals(id)) {
						outputString += s;
						outputString += stringToAdd;
					} else {
						outputString += s;
					}
				}
			} else {
				String[] sub = s.split("\"");
				if(sub[1].equals(id)) {
					outputString += s;
					outputString += stringToAdd;
				} else {
					outputString += s;
				}
			}
		}

		return outputString;
	}

	public static String before(String givenString, String id, String stringToAdd) {

		String outputString = "";

		String[] ss = givenString.split(">");
		
		for(int i = 0; i < ss.length; i++)
			ss[i] += ">";
		
		for(String s : ss) {
			if(!s.contains("\"")) {
				outputString += s;
			} else {
				String[] sub = s.split("\"");
				if(sub[1].equals(id)) {
					outputString += stringToAdd;
					outputString += s;
				} else {
					outputString += s;
				}
			}
		}
		
		return outputString;
	}
}