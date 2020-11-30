package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapWithList {

	public static void main(String args[]) {

		Map<String,List<String>> studentDept = new HashMap<String,List<String>>();
		List<String> students = new ArrayList<String>();
		students.add("Tuhin");
		students.add("Sankhayan");
		students.add("Ritwik");
		students.add("Aniket");
		students.add("Abhishek");
		
		studentDept.put("EC", students);
	}
}