import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] test = new String[strings.length];
        for(int i=0 ; i<strings.length ; i++){
            test[i] = strings[i].substring(n,n+1) + strings[i];
        }
        Arrays.sort(test);
        for(int i=0 ; i<strings.length ; i++){
            answer[i] = test[i].substring(1);
        }
        
        return answer;
    }
}