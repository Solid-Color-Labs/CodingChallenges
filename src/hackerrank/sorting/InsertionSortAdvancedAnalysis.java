package hackerrank.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by oklesing on 3/19/17.
 */
public class InsertionSortAdvancedAnalysis {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int i = 0; i < s; i++){
            int t = in.nextInt();
            int[] ar = new int[t];
            for (int j = 0; j < t; j++) {
                ar[j]=in.nextInt();
            }
            MergeSort sort = new MergeSort();
            sort.sort(ar);
            int shiftCount = sort.getShiftCount();
            System.out.println(shiftCount);
            printArray(ar);
        }
    }
    
    private static void printArray(int[] ar) {
        Arrays.stream(ar).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
    
    private static class MergeSort {
        private int[] numbers;
        private int[] helper;
        private int number;
        
        private int shiftCount = 0;
        
        private void sort(int[] values) {
            this.numbers = values;
            number = values.length;
            this.helper = new int[number];
            mergesort(0, number - 1);
        }
        
        private void mergesort(int low, int high) {
            // check if low is smaller then high, if not then the array is sorted
            if (low < high) {
                // Get the index of the element which is in the middle
                int middle = low + (high - low) / 2;
                // Sort the left side of the array
                mergesort(low, middle);
                // Sort the right side of the array
                mergesort(middle + 1, high);
                // Combine them both
                merge(low, middle, high);
            }
        }
        
        private void merge(int low, int middle, int high) {
            
            // Copy both parts into the helper array
            System.arraycopy(numbers, low, helper, low, high + 1 - low);
            
            int i = low;
            int j = middle + 1;
            int k = low;
            // Copy the smallest values from either the left or the right side back
            // to the original array
            while (i <= middle && j <= high) {
                if (helper[i] <= helper[j]) {
                    numbers[k] = helper[i];
                    i++;
                } else {
                    numbers[k] = helper[j];
                    j++;
                }
                k++;
            }
            // Copy the rest of the left side of the array into the target array
            while (i <= middle) {
                numbers[k] = helper[i];
                k++;
                i++;
            }
        }
        
        int getShiftCount() {
            return shiftCount;
        }
    }
    
}
