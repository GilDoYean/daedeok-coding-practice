class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for(int i=0;i<s;i++){
            answer += my_string.charAt(i);
        }
        answer += overwrite_string;
        int n = s+overwrite_string.length();
        for(int k = n ;k<my_string.length();k++)
        {
            answer += my_string.charAt(k);
        }
        return answer;
    }
}