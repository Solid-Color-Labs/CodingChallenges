package hackerrank.sorting;

import java.util.Scanner;

/**
 * Java quicksort implementation.
 */
public class QuickSort2Sorting {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        quickSort(ar, 0, ar.length - 1);
        printArray(ar);
    }
    
    private static void quickSort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
    }
    
    private static int partition(int ar[], int left, int right)
    {
        int i = left, j = right;
        int temp;
        int pivot = ar[(left + right) / 2];
        
        while (i <= j) {
            while (ar[i] < pivot)
                i++;
            while (ar[j] > pivot)
                j--;
            if (i <= j) {
                temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }
    
    private static void printArray(int[] ar) {
        for (int anAr : ar) {
            System.out.print(anAr + " ");
        }
    }
    
}
