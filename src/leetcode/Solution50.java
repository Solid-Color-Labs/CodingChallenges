package leetcode;

/*
50. Pow(x, n)
https://leetcode.com/problems/powx-n/
--------------------------------------
Implement pow(x, n).
--------------------------------------

Implemented using: https://en.wikipedia.org/wiki/Exponentiation_by_squaring
 */
public class Solution50 {
    
    public double myPow(double x, int n) {
        if (n < 0) {
            x = 1/x;
            n--;
        }
        if (n == 0) {
            return 1;
        }
        double y = 1;
        while (n > 1) {
            if (isEven(n)) {
                x *= x;
                n = n/2;
            } else {
                y = x*y;
                x *= x;
                n = (n-1)/2;
            }
        }
        return x*y;
    }
    
    private boolean isEven(int n) {
        return n % 2 == 0;
    }
    
}
