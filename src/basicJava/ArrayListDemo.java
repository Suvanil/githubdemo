package basicJava;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("Raj");
		al.add("is");
		al.add("a");
		al.add("Boy");
		System.out.println(al.size());
	System.out.println(al.get(1));
	System.out.println(al.isEmpty());
	if(al.contains("Raj"))   
	{
		System.out.println("Success");
	}
	}

}
