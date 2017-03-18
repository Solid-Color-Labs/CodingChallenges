package hackerrank.strings;

import java.util.Scanner;

/**
 * Suppose you have a String, , of length  that is indexed from  to . You also have some String, , that is the reverse of String .  is funny if the condition  is true for every character from  to .
 
 Note: For some String ,  denotes the ASCII value of the  -indexed character in . The absolute value of an integer, , is written as .
 
 Input Format
 
 The first line contains an integer,  (the number of test cases).
 Each line  of the  subsequent lines contain a string, .
 
 Constraints
 
 Output Format
 
 For each String  (where ), print whether it is  or  on a new line.
 
 Sample Input
 
 2
 acxz
 bcxz
 Sample Output
 
 Funny
 Not Funny
 Explanation
 
 Test Case 0:
 
 
 
 As each comparison is equal, we print .
 
 Test Case 1:
 , but
 At this point, we stop evaluating  (as ) and print .
 ---------------------------------------------------
 https://www.hackerrank.com/challenges/funny-string
 */
public class FunnyString {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numberOfTestCases = in.nextInt();
        for (int i = 0; i < numberOfTestCases; i++) {
            String s = in.next();
            if (isFunny(s)) {
                System.out.println("Funny");
            } else {
                System.out.println("Not Funny");
            }
        }
    }
    
    private static boolean isFunny(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (Math.abs(s.charAt(i) - s.charAt(i - 1)) != Math.abs(s.charAt(s.length() - i) - s.charAt(s.length() - i - 1))) {
                return false;
            }
        }
        return true;
    }
    
}
