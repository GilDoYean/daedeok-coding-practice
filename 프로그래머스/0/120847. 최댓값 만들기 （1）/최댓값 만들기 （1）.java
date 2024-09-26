import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int count=0;
        Arrays.sort(numbers);
        int[] num = new int[numbers.length];
        
        for(int i : numbers){    
        num[count] = i;
        count ++;
        }
        answer = num[numbers.length-1]*num[numbers.length-2];
        
        
        return answer;
    }
}