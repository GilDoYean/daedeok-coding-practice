import java.util.*;

class Solution {
    public List solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();
        int n=1;
        for(int i=0 ; i<numbers.length-1 ; i++){
            for(int j=i+1 ; j<numbers.length ; j++){
               n = numbers[i] + numbers[j];
                if(answer.contains(n)==false){
                    answer.add(n);
                }
            }
        }
        Collections.sort(answer);
        return answer;
    }
}