class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = 1;
        int max = n > m ? n : m;
        for(int i=2 ; i<=max ; i++){
            if(n%i==0&&m%i==0)
                answer[0] = i;
        }
        for(int i=1 ; i<=n*m ; i++){
        if(i%n==0&&i%m==0){
         answer[1] = i; 
            break;
        }
        }
        
        return answer;
    }
}