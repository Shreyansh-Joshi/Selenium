package Javaprogrammes;

import java.util.ArrayList;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {

		
		List value = new ArrayList<>();
		value.add("Selenium");
		value.add("Automation");
		value.add(100);
		value.add(true);
		value.add("&");
		value.add(10.505);
		System.out.println(value.size());
		for(int i=0;i<value.size();i++)
		{
			System.out.println(value.get(i));
		}
		
		
	}

}
