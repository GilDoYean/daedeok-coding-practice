class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        for(char ch : s.toCharArray()){
            if(ch>='a'&&ch<='z'){
                answer = false;
                break;
            }
            if(ch>='A'&&ch<='Z'){
                answer = false;
                break;
            }
        }
        if(s.length()!=6 && s.length()!=4){
            answer = false;
        }
        return answer;
    }
}