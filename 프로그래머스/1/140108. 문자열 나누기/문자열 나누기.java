class Solution {
    public int solution(String s) {
        int answer = 1;
        char test = s.charAt(0);
        int count= 1 ;
        
        for(int i=1 ; i<s.length() ; i++){
            if(count==0){
                answer++;
                test = s.charAt(i);
            }
            
            if(test==s.charAt(i)){
                count++;
            }
            else count--;
        }
        return answer;
    }
}