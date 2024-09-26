import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int cnt = 0;
        for(int i=0 ; i<commands.length ; i++){
            int[] len = new int[commands[i][1] - commands[i][0] + 1];
            for(int j=0 ; j<len.length ; j++){
                len[j] = array[commands[i][0]-1+j];
            }
            Arrays.sort(len);
            answer[cnt] = len[commands[i][2]-1];
            cnt++; 
        }
        return answer;
    }
}