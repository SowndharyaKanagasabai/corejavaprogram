package arraytypes;

public class Sorting2D_Array_Ex2 {

	public static void main(String[] args) {
		int arr[][]= {{12,24,35},{30,52,44},{54,60,72}};
		int temp=0;
		for(int r=0; r<arr.length; r++) {
			for(int c=0; c<arr.length; c++) {
				for(int k=0; k<arr.length; k++) {
					for(int l=0; l<arr.length; l++) {
						
						if(arr[r][c] < arr[k][l]) {
							temp=arr[r][c];
							arr[r][c]=arr[k][l];
							arr[k][l]=temp;
						}
						
					}
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
