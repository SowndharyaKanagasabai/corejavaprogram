package arraytypes;

import java.util.Arrays;

public class Deepcopy_Array {

	public static void main(String[] args) {
//		int[] array1= {2,4,8,6,4,9};
//		int[] copy_array=array1.clone();
//		//Shallow copy applied for one dimensional array: store in different memory location
//		System.out.println(array1==copy_array);
//		for(int i=0; i<copy_array.length;i++) {
//			System.out.print(copy_array[i]+" ");
//		}
//		System.out.println();
//		System.out.println("Clone_Array: "+Arrays.toString(copy_array));
		
		//TWO DIMENSIONAL ARRAY
		int array[][]= {
				   {10,20,30},
				   {40,50,60}
		           };
		int[][] copy_array;
		int temp;
		
        copy_array=array.clone();
		System.out.println(array[0][1]==copy_array[0][1]);
		for(int i=0; i<copy_array.length; i++) {
			for(int j=0; j<copy_array.length;j++) {
				System.out.print(copy_array[i][j]+" ");
			}
			System.out.println();
		}
	}
}

      