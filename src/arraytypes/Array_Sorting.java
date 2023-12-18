package arraytypes;

import java.util.Arrays;

public class Array_Sorting {

	public static void main(String[] args) {
		int arr[]= {6,8,9,10,13,26,2,15};
		System.out.println("Before Sort: "+Arrays.toString(arr));
		int temp;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorting Array: "+Arrays.toString(arr));

	}

}
