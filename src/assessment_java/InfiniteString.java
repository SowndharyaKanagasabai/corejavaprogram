package assessment_java;

//public class InfiniteString {
//	public static void main(String[] args) {
import java.util.Scanner;

public class InfiniteString {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        int t = 1; // Number of test cases
        for (int i = 0; i < t; i++) {
            String infStr = "ghijk"; // S
            String toFind = "ghijkghi"; // A (read the whole line and trim any leading/trailing whitespaces)

            if (isSubstringPresent(infStr, toFind)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    private static boolean isSubstringPresent(String infStr,String toFind) {
        // Concatenate infStr with itself to create the infinite string INF
        String infiniteString = infStr + infStr;

        // Check if toFind is a substring of the infiniteString
        return infiniteString.contains(toFind);
    }
}
		

	

