package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		//using heterogeneous parameters
		//ArrayList<Interge>al=new ArrayList<Interger>();
		List al=new ArrayList();
		
		//ArrayList al =new ArrayList();
		al.add("welcome");
		al.add(12);
		al.add(23.05);
		al.add(50000);
		al.add(true);
		System.out.println("Arraylist: "+al);
		System.out.println("Size of al: "+al.size());
		al.remove(2);
		System.out.println("After removing elements: "+al);
		
		//retrieve specific element
		System.out.println("get the specific element: "+al.get(1));
		
		//insert new element
		al.add(2, "python");//python,here 2 is index of element/object
		System.out.println("set the Specific element: "+al);
		
		//change/replace element
		al.set(3, "c++");
		System.out.println("update the new value: "+al);
		
		//return true or false
		System.out.println("contains: "+al.contains(12));
		
		
		System.out.println("---------------------------------------------------------");
		//1 for loop
		//2 for each
		//3 iterator
		
		//1 for loop
		System.out.println("Reading elements using for loop: ");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("Reading elements using for each: ");
		//Object is helps to get all kind of data that why we use the data type of object
		for(Object element: al) {
			System.out.println(element);
		}
		System.out.println("---------------------------------------------------------------");
		System.out.println("Reading elements using Iterator: ");
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
