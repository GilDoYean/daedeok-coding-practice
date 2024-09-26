import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        String answer2 = "";
        int cnt = 0;
        for(int i : food){
            if(i>=2){
             int q = i/2;
            for(int k=0;k<q;k++){
             answer += cnt;
            }
            }
             cnt++;
        }
        for(int j=answer.length() ; j>0 ; j--){
            answer2 += answer.substring(j-1,j);
        }
        answer += 0;
        answer += answer2;
        return answer;
    }
}