package hackerrank.warmup;

import java.util.Scanner;

/**
 Consider a staircase of size :
 
 #
 ##
 ###
 ####
 Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.
 
 Write a program that prints a staircase of size .
 
 Input Format
 
 A single integer, , denoting the size of the staircase.
 
 Output Format
 
 Print a staircase of size  using # symbols and spaces.
 
 Note: The last line must have  spaces in it.
 
 Sample Input
 
 6
 Sample Output
 
 #
 ##
 ###
 ####
 #####
 ######
 ----------------------------------
 https://www.hackerrank.com/challenges/staircase
 */
public class Staircase {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner scanner = new Scanner(System.in);
        int baseHeight = scanner.nextInt();
        scanner.close();
        
        String staircase = "";
        
        for (int i = baseHeight; i >= 1; i--) {
            for (int j = 1; j <= baseHeight; j++) {
                if (j >= i) {
                    staircase += "#";
                } else {
                    staircase += " ";
                }
            }
            staircase += "\n";
        }
        System.out.println(staircase);
    }
    
}
