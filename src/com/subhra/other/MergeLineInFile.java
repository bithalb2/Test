package com.subhra.other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class MergeLineInFile{
	
	public static void main(String args[]) throws Exception {
	
		File file = new File("input.txt");
	
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		FileWriter fr = new FileWriter("output.txt");
		
		List<String> list = new ArrayList<String>();
		
		String st;
		while((st = br.readLine()) != null)	{
			list.add(st.trim());
		}
		
		for(int i = 0; i < list.size() / 2; i++) {
			String res = merge(list.get(i * 2), list.get((i * 2) + 1));
			fr.write(res);
			fr.write("\r\n");
		}
		
		if(list.size() % 2 != 0)
			fr.write(list.get(list.size() - 1));
		fr.close();
		br.close();
	}

	private static String merge(String string, String string2) {
		StringBuffer res = new StringBuffer("");
		
		for(int i = 0; i < string.length() || i < string2.length(); i++) {
			
			if(i < string.length())
				res.append(string.charAt(i));
			
			if(i < string2.length())
				res.append(string2.charAt(i));
		}
		
		return res.toString();
	}
}