class Solution {
    public int solution(int n) {
        int answer = 0;
        String ans = Integer.toString(n);
        for(int i=0 ; i<ans.length() ; i++){
            answer += Integer.parseInt(ans.substring(i,i+1));
        }
        return answer;
    }
}