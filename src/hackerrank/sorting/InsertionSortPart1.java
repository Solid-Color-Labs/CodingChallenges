package hackerrank.sorting;

import java.util.Scanner;

/**
 * ******************************************************************************************************
 * Note: The reason ar[j-1] is assigned the value of ar[j], then printed and then assigned temp, is due *
 * to the hackerrank requirements of printing the array;                                                *
 * ******************************************************************************************************
 *
 * Sorting
 One common task for computers is to sort data. For example, people might want to see all their files on a computer sorted by size. Since sorting is a simple problem with many different possible solutions, it is often used to introduce the study of algorithms.
 
 Insertion Sort
 These challenges will cover Insertion Sort, a simple and intuitive sorting algorithm. We will first start with an already sorted list.
 
 Insert element into sorted list
 Given a sorted list with an unsorted number  in the rightmost cell, can you write some simple code to insert  into the array so that it remains sorted?
 
 Print the array every time a value is shifted in the array until the array is fully sorted. The goal of this challenge is to follow the correct order of insertion sort.
 
 Guideline: You can copy the value of  to a variable and consider its cell "empty". Since this leaves an extra cell empty on the right, you can shift everything over until  can be inserted. This will create a duplicate of each value, but when you reach the right spot, you can replace it with .
 
 Input Format
 There will be two lines of input:
 
 - the size of the array
 - the unsorted array of integers
 Output Format
 On each line, output the entire array every time an item is shifted in it.
 
 Constraints
 
 
 Sample Input
 
 5
 2 4 6 8 3
 Sample Output
 
 2 4 6 8 8
 2 4 6 6 8
 2 4 4 6 8
 2 3 4 6 8
 Explanation
 
 is removed from the end of the array.
 In the st line , so  is shifted one cell to the right.
 In the nd line , so  is shifted one cell to the right.
 In the rd line , so  is shifted one cell to the right.
 In the th line , so  is placed at position .
 
 Task
 
 Complete the method insertionSort which takes in one parameter:
 
 - an array with the value  in the right-most cell.
 */
public class InsertionSortPart1 {
    
    private static void insertIntoSorted(int[] ar) {
        // Fill up this function
        for (int i = 1; i < ar.length; i++) {
            for(int j = i; j > 0; j--){
                if(ar[j] < ar[j-1]){
                    int temp = ar[j];
                    ar[j] = ar[j-1];
                    ar[j-1] = ar[j];
                    printArray(ar);
                    ar[j-1] = temp;
                }
            }
        }
        printArray(ar);
    }
    
    
    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
