package leetcode;

import java.util.Arrays;

/**
 * Created by oklesing on 11/12/16.
 */
public class Solution451 {
    
    public String frequencySort(String s) {
        char[] c = s.toCharArray();
        char[] chars = new char[256];
        for (char ch : c) {
            chars[ch]++;
        }
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; chars[i] != 0; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
    
}
