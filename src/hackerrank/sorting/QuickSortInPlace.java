package hackerrank.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 The previous version of Quicksort was easy to understand, but it was not optimal. It required copying the numbers into other arrays, which takes up space and time. To make things faster, one can create an "in-place" version of Quicksort, where the numbers are all sorted within the array itself.
 
 Challenge
 Create an in-place version of Quicksort. You need to follow Lomuto Partitioning method.
 
 Guideline
 Instead of copying the array into multiple sub-arrays, use indices to keep track of the different sub-arrays. You can pass the indices to a modified partition method. The partition method should partition the sub-array and then return the index location where the pivot gets placed, so you can then call partition on each side of the pivot.
 
 Always select the last element in the 'sub-array' as a pivot.
 Partition the left side and then the right side of the sub-array.
 Print out the whole array at the end of every partitioning method.
 An array of length  or less will be considered sorted, and there is no need to sort or to print them.
 Since you cannot just create new sub-arrays for the elements, partition method will need to use another trick to keep track of which elements are greater and which are lower than the pivot.
 
 The In-place Trick
 
 If an element is lower than the pivot, you should swap it with a larger element on the left-side of the sub-array.
 Greater elements should remain where they are.
 At the end of the partitioning method, the pivot should be swapped with the first element of the right partition, consisting of all larger elements, of the sub-array.
 To ensure that you don't swap a small element with another small element, use an index to keep track of the small elements that have already been swapped into their "place".
 Lomuto-partitioning
 
 Input Format
 There will be two lines of input:
 
 - the size of the array
 - the  numbers of the array
 Output Format
 Print the entire array on a new line at the end of every partitioning method.
 
 Constraints
 
 
 There are no duplicate numbers.
 
 Sample Input
 
 7
 1 3 9 8 2 7 5
 Sample Output
 
 1 3 2 5 9 7 8
 1 2 3 5 9 7 8
 1 2 3 5 7 8 9
 Explanation
 5 is initally selected as the pivot, and the array is partitioned as shown in the diagram. The left side is partitioned next with 2 as the pivot. Finally, the right side is partitioned with 8 as the pivot. The entire array is now sorted.
 --------------------------------
 https://www.hackerrank.com/challenges/quicksort3
 */
public class QuickSortInPlace {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        quickSort(ar, 0, ar.length - 1);
    }
    
    private static void quickSort(int[] ar, int lo, int hi) {
        if (lo < hi) {
            int p = partition(ar, lo, hi);
            printArray(ar);
            quickSort(ar, lo, p - 1);
            quickSort(ar, p + 1, hi);
        }
        
    }
    
    private static int partition(int[] ar, int lo, int hi) {
        int p = ar[hi];
        int i = lo - 1;
        for (int j = lo; j < hi; j++) {
            if (ar[j] <= p) {
                i++;
                swap(ar, i, j);
            }
        }
        swap(ar, i + 1, hi);
        return i + 1;
    }
    
    private static void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] =  temp;
    }
    
    private static void printArray(int[] ar) {
        Arrays.stream(ar).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}
