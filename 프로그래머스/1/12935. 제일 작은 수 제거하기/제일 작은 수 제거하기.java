import java.util.*;
class Solution {
    public List solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int min = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]<min)
                min = arr[i];
        }
        for(int j=0 ; j<arr.length ; j++){
            if(arr[j] != min){
                answer.add(arr[j]);
            }
        }
        if(answer.size()==0){
            answer.add(-1);
        }
        return answer;
    }
}