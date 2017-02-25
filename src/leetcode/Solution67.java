package leetcode;

/**
 * Created by oklesing on 9/28/16.
 */
public class Solution67 {
    
    public String addBinary(String a, String b) {
        int radix = 2;
        long num1 = Long.parseLong(a, radix);
        long num2 = Long.parseLong(b, radix);
        long sum = num1 + num2;
        return String.valueOf(sum);
    }
    
}
