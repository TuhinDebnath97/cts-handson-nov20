package main;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String args[]) {

	List<User> userdata = new ArrayList<User>();
	userdata.add(new User(1,"Tuhin","hello123"));
	userdata.add(new User(2,"Sankhayan","hola123"));
	userdata.add(new User(3,"Sayak","sdd123"));
	userdata.add(new User(4,"Ritwik","sdadlo123"));
	userdata.add(new User(5,"Rounak","dslo123"));
	
	for(User user: userdata) {
		if(user.getName().length()>5)
		System.out.println("Id: "+user.getId()+" Name: "+user.getName());
	}
}
}