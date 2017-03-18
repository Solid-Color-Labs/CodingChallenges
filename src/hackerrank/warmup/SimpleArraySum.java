package hackerrank.warmup;

import java.util.Scanner;

/**
 * Given an array of  integers, can you find the sum of its elements?
 
 Input Format
 
 The first line contains an integer, , denoting the size of the array.
 The second line contains  space-separated integers representing the array's elements.
 
 Output Format
 
 Print the sum of the array's elements as a single integer.
 
 Sample Input
 
 6
 1 2 3 4 10 11
 Sample Output: 31
 
 -----------------------------------------------------------
 https://www.hackerrank.com/challenges/simple-array-sum
 */
public class SimpleArraySum {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        int sum = 0;
        while (scanner.hasNext()) {
            sum += scanner.nextInt();
        }
        scanner.close();
        System.out.println(sum);
    }
    
}

/*
Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        scanner.close();
 */
