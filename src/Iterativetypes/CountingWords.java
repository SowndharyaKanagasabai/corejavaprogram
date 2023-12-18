package Iterativetypes;

public class CountingWords {

	public static void main(String[] args) {
		
		//COUNT THE WORD IN A STRING USING CHARAT(i) AND LOOP
//		String str="Best Wishes To All";
//		int count=1;
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
//				count++;
//			}
//		}
//        System.out.println("Count the Words in a String: "+count);
        
		
		//COUNT THE WORD IN A STRING:
		String str="Best Wishes To All";
		String[] Words=str.split(" ");
		int count=0;
		for(String word_string:Words) {
			count++;
			System.out.println(count+": "+word_string);
		}
		System.out.println("Count the Words in a String: "+count);
	}

}
