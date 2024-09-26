import java.util.*;

class Solution {
    public List solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        int test = 0;
        for(int i=0 ; i<intStrs.length ; i++){
            test = Integer.parseInt(intStrs[i].substring(s,s + l));
            if(test>k){
                answer.add(test);
            }
        }
        return answer;
    }
}