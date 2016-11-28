package leetcode;

/*
 8. String to Integer (atoi)
 https://leetcode.com/problems/string-to-integer-atoi/
 -----------------------------------------------------
  
 Implement atoi to convert a string to an integer.

 Requirements for atoi:
 The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
 
 The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
 
 If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
 
 If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 */
public class Solution8 {
    
    public int myAtoi(String str) {
        str = str.trim();
        if (str.isEmpty()) return 0;
        StringBuilder sb = new StringBuilder();
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            sb.append(str.charAt(0));
            str = str.substring(1);
        }
        for (int i = 0; i < str.length() && Character.isDigit(str.charAt(i)); i++) {
            sb.append(str.charAt(i));
        }
        str = sb.toString();
        if (str.isEmpty() || (str.length() == 1 && !Character.isDigit(str.charAt(0)))) return 0;
        try {
            long l = Long.parseLong(str);
            if (l < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            else if (l > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            return (int) l;
        } catch (NumberFormatException e) {
            if (str.charAt(0) == '-') {
                return Integer.MIN_VALUE;
            }
            return Integer.MAX_VALUE;
        }
    }
    
}
