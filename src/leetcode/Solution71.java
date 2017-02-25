package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oklesing on 10/5/16.
 */
public class Solution71 {
    
    public String simplifyPath(String path) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == '/') list.add(i);
        }
        if (list.isEmpty() || path.length() == 1) return path;
        switch (path.charAt(path.length() - 1)) {
            case '/':
                String s = path.substring(list.get(list.size() - 2), path.length() - 1);
                //return s.equals(".") ? s.substring()
            case '.':
                return path.substring(list.get(list.size() - 1), path.length() - 1);
            default:
                return path.substring(list.get(list.size() - 1));
        }
    }
    
}
