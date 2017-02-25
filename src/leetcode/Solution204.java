package leetcode;

/**
 * Created by oklesing on 9/20/16.
 */
public class Solution204 {
    
    public int countPrimes(int n) {
        int numberOfPrimes = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) numberOfPrimes++;
        }
        return numberOfPrimes;
    }
    
    private static boolean isPrime(int number) {
    
        if (number >= 2 && number % 2 == 0) return true;
        
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i+= 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
