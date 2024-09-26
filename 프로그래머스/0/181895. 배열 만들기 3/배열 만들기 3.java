
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int n = (intervals[0][1]-intervals[0][0])+(intervals[1][1]-intervals[1][0])+2;
        int[] answer = new int[n];
        int count =0;
        for(int i=intervals[0][0];i<intervals[0][1]+1;i++){
        answer[count] = arr[i];
            count++;
        }
        for(int i=intervals[1][0];i<intervals[1][1]+1;i++){
        answer[count] = arr[i];
            count++;
        }
        
        return answer;
    }
}