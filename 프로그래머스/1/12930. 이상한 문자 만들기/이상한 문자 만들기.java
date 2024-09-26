import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] ans = s.split(" ",-1);
        int cnt=0;
        for(String test : ans){
            cnt++;
            for(int i=0 ; i<test.length() ; i++){
                if(i%2==0)
                answer += (test.substring(i,i+1)).toUpperCase();
                else
                answer += (test.substring(i,i+1)).toLowerCase();
            }
            if(cnt != ans.length)
            answer += " ";
        }
        return answer;
    }
}