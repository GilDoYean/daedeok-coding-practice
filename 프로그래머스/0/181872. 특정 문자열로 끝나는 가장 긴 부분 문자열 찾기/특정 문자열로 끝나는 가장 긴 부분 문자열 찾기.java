class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int findIndex = myString.lastIndexOf(pat);
        
        for(int i=0;i<findIndex+pat.length();i++){
            answer += myString.charAt(i);
        }
        return answer;
    }
}