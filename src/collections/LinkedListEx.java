package collections;

import java.util.LinkedList;
public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<Integer> numlist=new LinkedList<>();
		numlist.add(30);
		numlist.add(47);
		numlist.add(50);
		numlist.addFirst(15);
		numlist.add(25);
		//numlist.offerLast(36);
		numlist.addLast(36);
		System.out.println("Linked List: "+numlist);
		System.out.println("pollFirst: "+numlist.pollFirst());
		System.out.println("getFirst: "+numlist.getFirst());
		
		
	}

}
