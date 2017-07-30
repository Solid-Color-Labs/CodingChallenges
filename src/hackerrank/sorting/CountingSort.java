package hackerrank.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by oklesing on 3/18/17.
 */
public class CountingSort {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        int[] c = countingSort(ar);
        printArray(c);
    }
    
    private static int[] countingSort(int[] ar) {
        return countingSort(ar, ar.length);
    }
    
    private static int[] countingSort(int[] a, int k) {
        int b[] = new int[k];
        for (int i : a) {
            b[i]++;
        }
        for (int i = 1; i < k; i++) {
            b[i] += b[i-1];
        }
        int c[] = new int[a.length];
        for (int i = a.length-1; i >= 0; i--) {
            c[--b[a[i]]] = a[i];
        }
        return c;
    }
    
    private static void printArray(int[] ar) {
        Arrays.stream(ar).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
    
}
