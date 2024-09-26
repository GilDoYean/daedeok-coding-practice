import java.util.*;
class Solution {
    public String solution(String s) {
        int max = -2147000000;
		int min = 2147000000;
        String answer = "";
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
         	max = Math.max(max, Integer.parseInt(arr[i]));
		    min = Math.min(min, Integer.parseInt(arr[i]));
        }
        answer = min + " " + max;
        return answer;
    }
}