class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int answer2 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        answer = answer2>=(2*a*b) ? answer2 : 2*a*b ;
        return answer;
    }
}