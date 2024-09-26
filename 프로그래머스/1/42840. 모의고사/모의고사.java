import java.util.*;
class Solution {
    public List solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] stud1 = {1, 2, 3, 4, 5};
        int[] stud2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] stud3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count  = {0, 0, 0};
        for(int i=0 ; i<answers.length ; i++){
            if(answers[i] == stud1[i%5])
                count[0]++;
            if(answers[i] == stud2[i%8])
                count[1]++;
            if(answers[i] == stud3[i%10])
                count[2]++;
        }
        
        int max = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }
        
        int n = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
               answer.add(i+1);
            }
        }
        
//         int[] answer = new int[n];
//         for(int i=0 ; i< answer.length ; i++){
//             answer[i] = Arrays.asList(count).indexOf(max);
//         }
        
        return answer;
    }
}