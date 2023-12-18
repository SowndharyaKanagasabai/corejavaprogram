package functiontypes;

public class InAmsterdam {

	   public int countAm(String str) {

	       int count = 0;

	       String lowerCaseStr = str.toLowerCase();

	       int index = lowerCaseStr.indexOf("am");

	       while (index != -1) {

	           count++;

	           index = lowerCaseStr.indexOf("am", index + 2); // Move index by 2 to avoid counting overlapping occurrences

	       }

	       return count;

	   }

	   public static void main(String[] args) {

	       InAmsterdam obj = new InAmsterdam();

	       String inputString = "I am in Amsterdam am I?";

	       int result = obj.countAm(inputString);

	       System.out.println("Number of times 'am' appears in the String: " + result);

	   }

	}



