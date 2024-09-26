import java.lang.Math;
import java.util.*;

class Solution {
    public List solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        double result=0;
        for(int i=0;i<arr.length;i++){
         if(Math.pow(2, i)>=arr.length){
         result = Math.pow(2, i);
         break;
         }   
        }
        for(int i=0;i<arr.length;i++){
            answer.add(arr[i]);
        }
        if(answer.size()<result){
            while(answer.size()<result){
                answer.add(0);
            }
        }
        return answer;
    }
}