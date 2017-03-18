package hackerrank.warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 
 Input Format
 
 A single line of five space-separated integers.
 
 Constraints
 
 Each integer is in the inclusive range .
 Output Format
 
 Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)
 
 Sample Input
 
 1 2 3 4 5
 Sample Output
 
 10 14
 --------------------------------------------
 https://www.hackerrank.com/challenges/mini-max-sum
 */
public class MiniMaxSum {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        long[] l = new long[]{a, b, c, d, e};
        Arrays.sort(l);
        
        long min = l[0] + l[1] + l[2] + l[3];
        long max = l[1] + l[2] + l[3] + l[4];
        System.out.println(min + " " + max);
    }
    
}
