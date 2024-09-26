import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str);
        StringBuilder sb = new StringBuilder();
        for (String aList : str)
            sb.append(aList);
       
       return Long.parseLong(sb.reverse().toString()); //String to long
    }
}