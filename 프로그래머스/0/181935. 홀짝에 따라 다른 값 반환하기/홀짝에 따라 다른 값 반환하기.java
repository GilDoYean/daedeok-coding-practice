class Solution {
    public int solution(int n) {
        int answer = 0;
            for(int i=0;i<n+1;i++){
                 
                if(n%2!=0){
                    if(i%2!=0){
                        answer += i;
                    }
                 }
                
                else if(n%2==0){
                    if(i%2==0){
                        answer += i*i;
                    }
                 }
            }
        
        return answer;
    }
}