package hackerrank.sorting;

import java.util.Scanner;

/**
 In Insertion Sort Part 1, you sorted one element into an array. Using the same approach repeatedly, can you sort an entire unsorted array?
 
 Guideline: You already can place an element into a sorted array. How can you use that code to build up a sorted array, one element at a time? Note that in the first step, when you consider an array with just the first element - that is already "sorted" since there's nothing to its left that is smaller.
 
 In this challenge, don't print every time you move an element. Instead, print the array after each iteration of the insertion-sort, i.e., whenever the next element is placed at its correct position.
 
 Since the array composed of just the first element is already "sorted", begin printing from the second element and on.
 
 Input Format
 There will be two lines of input:
 
 - the size of the array
 - a list of numbers that makes up the array
 Output Format
 On each line, output the entire array at every iteration.
 
 Constraints
 
 
 Sample Input
 
 6
 1 4 3 5 6 2
 Sample Output
 
 1 4 3 5 6 2
 1 3 4 5 6 2
 1 3 4 5 6 2
 1 3 4 5 6 2
 1 2 3 4 5 6
 Explanation
 Insertion Sort checks  first and doesn't need to move it, so it just prints out the array. Next,  is inserted next to , and the array is printed out. This continues one element at a time until the entire array is sorted.
 
 Task
 The method insertionSort takes in one parameter: , an unsorted array. Use an Insertion Sort Algorithm to sort the entire array.
 ---------------------------------------------
 https://www.hackerrank.com/challenges/insertionsort2
 */
public class InsertionSortPart2 {
    
    private static void insertionSortPart2(int[] ar)
    {
        // Fill up the code for the required logic here
        // Manipulate the array as required
        // The code for Input/Output is already provided
        for (int i = 1; i < ar.length; i++) {
            int x = ar[i];
            int j = i - 1;
            while (j >= 0 && ar[j] > x) {
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j + 1] = x;
            printArray(ar);
        }
    }
    
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertionSortPart2(ar);
        
    }
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
    
}
