package hackerrank;

import java.util.Scanner;

/**
 Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.
 
 Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.
 
 Input Format
 
 The first line contains an integer, , denoting the size of the array.
 The second line contains  space-separated integers describing an array of numbers .
 
 Output Format
 
 You must print the following  lines:
 
 A decimal representing of the fraction of positive numbers in the array.
 A decimal representing of the fraction of negative numbers in the array.
 A decimal representing of the fraction of zeroes in the array.
 Sample Input
 
 6
 -4 3 -9 0 4 1
 Sample Output
 
 0.500000
 0.333333
 0.166667
 -----------------------------
 https://www.hackerrank.com/challenges/plus-minus
 */
public class PlusMinus {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int denominator = scanner.nextInt();
        int posNumerators = 0;
        int negNumerators = 0;
        int zeroNumerators = 0;
        
        while (scanner.hasNext()) {
            int numerator = scanner.nextInt();
            if (numerator > 0) {
                posNumerators++;
            } else if (numerator < 0) {
                negNumerators++;
            } else {
                zeroNumerators++;
            }
        }
    
        scanner.close();
        
        double posFraction = (double)posNumerators / denominator;
        double negFraction = (double)negNumerators / denominator;
        double zeroFraction = (double)zeroNumerators / denominator;
        
        System.out.println(posFraction);
        System.out.println(negFraction);
        System.out.println(zeroFraction);
        
    }
    
}
