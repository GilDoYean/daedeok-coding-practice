import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);
        int count =0;
        
        for (int i : num_list) {
            if(count>4){
                break;
            }
           answer[count] = i; 
           count++;
        }
             return answer;
    }
}