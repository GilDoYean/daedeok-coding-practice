class Solution {
    public String solution(String rny_string) {
        String answer = "";
        char[] an =  rny_string.toCharArray();
        for(int i=0;i<rny_string.length();i++){
            if(an[i]=='m'){
                answer += "rn";
            }
            else
            
            answer += an[i];
        }
        return answer;
    }
}