package arraytypes;

import java.util.Arrays;

public class Sortingarray_Alphabet {

	public static void main(String[] args) {
		// INT ARRAY SORTING 
		int[] numbers= {30,50,20,60,10,80,40};
		Arrays.sort(numbers);
		System.out.println("Number_Sorting: "+Arrays.toString(numbers));
		//ALPHABET ARRAY SORTING WITHOUT TEMP VARIABLE
		String[] Friends= {"Pavithra","Sowndharya","Archana","Jaseema","Pradeepa"};
		Arrays.sort(Friends);
		System.out.println("Alphabet_Sorting: "+Arrays.toString(Friends));
		
		
	}

}
