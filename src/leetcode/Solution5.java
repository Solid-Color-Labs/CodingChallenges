package leetcode;

/**
 * Created by oklesing on 9/11/16.
 */
public class Solution5 {
    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            
        }
        return null;
    }
    
    private boolean isPalindrome(String s) {
        String r = new StringBuilder(s).reverse().toString();
        return r.equals(s);
    }
}
