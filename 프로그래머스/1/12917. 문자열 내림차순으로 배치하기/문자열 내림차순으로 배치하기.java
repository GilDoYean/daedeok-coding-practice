import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        for(String c : arr){
            answer += c;
        }
        return answer;
    }
}