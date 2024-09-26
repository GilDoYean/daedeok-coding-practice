class Solution {
    public int solution(int num) {
        int answer = 0;
        long test = (long) num;
        
        while(test>1){
            if(test%2==0)   
                test = test/2;
            else
                test = (test*3) + 1; 
            
             answer ++;
            if(answer>500){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}