package basicJava;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Raja");
		hs.add("is");
		hs.add("bad");
		hs.add("person");//Not sorted
		hs.add("person");// No Repeat
		Iterator<String> it=hs.iterator();//Change to iteration 
		
		while(it.hasNext())
			
		{
			System.out.println(it.next());
			
			
		}
		
	}

}
