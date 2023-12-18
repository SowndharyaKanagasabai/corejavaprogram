package collections;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> student_List = new ArrayList<>();
		student_List.add("Sowndharya");
		student_List.add("Pavithra");
		student_List.add("Jaseema");
		student_List.add("Pradeepa");
		student_List.add("Archana");
		student_List.add(null);
		System.out.println("STUDENTS LIST: " + student_List);
		System.out.println("Contains: " + student_List.contains("sowmi"));
		System.out.println("Clone(): " + student_List.clone());
		System.out.println("Indexof: " + student_List.indexOf("Pavithra"));
		System.out.println("Get: " + student_List.get(2));
		System.out.println("Size of Student List: " + student_List.size());
		System.out.println("----------------------------------");
		System.out.println("My sorted List: ");
		Collections.sort(student_List);
		for (String name : student_List) {
			System.out.println(name);
		}
		System.out.println("----------------------------------");
		System.out.println("Remove: " + student_List.remove(5));
		student_List.clear();
		System.out.println("IsEmpty: " + student_List.isEmpty());
		System.out.println("STUDENTS LIST: " + student_List);

	}

}
