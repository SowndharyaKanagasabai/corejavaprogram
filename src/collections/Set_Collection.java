package collections;

import java.util.HashSet;
public class Set_Collection {

	public static void main(String[] args) {
		//set 1
		HashSet<Integer> even = new HashSet<>();
		even.add(null);
		even.add(22);
		even.add(24);
		even.add(26);
		even.add(30);
		even.add(24);
		even.add(null);
		System.out.println("HashSet1: "+even);
		//set 2
		HashSet<Integer> odd =new HashSet<>();
		odd.add(21);
		odd.add(23);
		odd.add(25);
		odd.add(26);
		odd.add(null);
		System.out.println("HashSet2: "+odd);
		
		//UNION
		even.addAll(odd);
		System.out.println("UNION SET: "+even);
		
		//INTERSECTION
		even.retainAll(odd);
		System.out.println("INTERSECTION SET: "+even);
		
		//DIFFERENCE
		even.removeAll(odd);
		System.out.println("DIFFERENCE SET: "+even);
	}

}
