package hackerrank.strings;

import java.util.*;

/**
 Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence "The quick brown fox jumps over the lazy dog" repeatedly, because it is a pangram. (Pangrams are sentences constructed by using every letter of the alphabet at least once.)
 
 After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.
 
 Given a sentence , tell Roy if it is a pangram or not.
 
 Input Format
 
 Input consists of a string .
 
 Constraints
 Length of  can be at most   and it may contain spaces, lower case and upper case letters. Lower-case and upper-case instances of a letter are considered the same.
 
 Output Format
 
 Output a line containing pangram if  is a pangram, otherwise output not pangram.
 -------------------------------
 https://www.hackerrank.com/challenges/pangrams
 */
public class Pangrams {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.toLowerCase();
        Set<Character> set = new TreeSet<>();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                set.add(c);
            }
            if (set.size() == 26) {
                break;
            }
        }
        if (set.size() == 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }
    
}
