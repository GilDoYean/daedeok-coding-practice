class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] ans = my_string.split("");
        String a = ans[num1];
        ans[num1] = ans[num2];
        ans[num2] = a;
        for(String b: ans){
            answer += b;
        }
        return answer;
    }
}