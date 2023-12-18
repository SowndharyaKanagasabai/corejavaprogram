package functiontypes;

public class PatternEx {

	public static void main(String[] args) {
//		//LEFT TRIANGLE PATTERN:
//		for(int i=1; i<=5; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("-----NUMBER TYPE-----");
//		for(int i=1; i<5; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		System.out.println("-----ALPHABET-PATTERN-----");
		for(int i=65; i<=70; i++) {
			for(int j=65; j<=i; j++) {
				System.out.print((char)i+" ");
			}
			System.out.println();
		}
		
	}

}

