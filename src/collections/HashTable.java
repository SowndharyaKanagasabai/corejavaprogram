package collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class HashTable {
	public static void main(String[] args) {
		
		Hashtable<Integer,String>ht=new Hashtable<Integer,String>();
		ht.put(01, "Java");
		ht.put(02, "python");
		ht.put(03, "C++");
		ht.put(04, "c#");
		ht.put(05, "HTML");
		//ht.put(05, null); //synchronized,hashtable not allow null keys and values
		ht.putIfAbsent(06, "PHP");
		System.out.println("HASHTABLE: "+ht);
		System.out.println("Entry Set: "+ht.entrySet());
		System.out.println("Contains: "+ht.containsKey(03));
	
//		Iterator<String>i=hs.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		Iterator<Entry<Integer,String>>new_Iterator=ht.entrySet().iterator();
		//Iterating every set of entry in the HashTable
		while(new_Iterator.hasNext()) {
			Map.Entry<Integer, String>new_Map = (Map.Entry<Integer, String>)new_Iterator.next();
			//Displaying HashTable
			System.out.println(new_Map.getKey()+" = "+new_Map.getValue());
		}

//HASH MAP:		
		
		System.out.println("----------------------HASH MAP---------------");
		HashMap<Integer, String>hm=new HashMap<Integer, String>();
		hm.put(101, "English");
		hm.put(102, "Maths");
		hm.put(103, "Science");
		hm.put(104, "Social");
		hm.put(null, null);//Asynchronized hashmap is allow one null key and multiple null values
		hm.put(105, null);
		System.out.println("HASHMAP: "+hm);	
		Iterator<Entry<Integer, String>>new_Iterator1 = hm.entrySet().iterator();
		while(new_Iterator1.hasNext()) {
			Map.Entry<Integer, String>new_map=(Map.Entry<Integer, String>)new_Iterator1.next();
			System.out.println(new_map.getKey()+" = "+new_map.getValue());
		}
	}

}
