package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String> ();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println("elements al: "+al);
		
		ArrayList<String>all=new ArrayList<String>();
		all.addAll(al);
		System.out.println("elements al_demo: "+all);
		
		all.removeAll(al);
		System.out.println("after removing al_demo: "+all);
		
		System.out.println("ArratList elements al: "+al);
		Collections.sort(al);
		System.out.println("After sorting using collections: "+al);
	}
}
