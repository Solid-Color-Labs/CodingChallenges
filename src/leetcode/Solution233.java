package leetcode;

import java.util.stream.IntStream;

//https://leetcode.com/problems/number-of-digit-one/
public class Solution233 {
    
    public int countDigitOne(int n) {
        long count = 0;
        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            IntStream nums = s.chars();
            count += nums.filter(j -> j == '1')
                         .count();
        }
        return (int)count;
    }
    
}
