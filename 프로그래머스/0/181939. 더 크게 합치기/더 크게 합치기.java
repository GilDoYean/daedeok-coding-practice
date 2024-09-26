class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ans1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int ans2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        
        answer = ans1>=ans2 ? ans1 : ans2; 
        
        return answer;
    }
}