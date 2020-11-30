package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MultipleValueMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Map<String,List<String>> m1=new HashMap<String,List<String>>();
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Akash");
		a1.add("Ayan");
		m1.put("CSE",a1);
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Sujit");
		a2.add("Rekha");
		m1.put("ECE",a2);
		ArrayList<String> a3=new ArrayList<String>();
		a3.add("Raj");
		a3.add("Souvik");
		m1.put("Mech",a3);
		
		
		for(Map.Entry m:m1.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		
	}

	}}