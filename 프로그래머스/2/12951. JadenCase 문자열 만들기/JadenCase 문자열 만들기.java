class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        answer += arr[0].toUpperCase();
        for(int i=1 ; i<s.length() ; i++){
        if(arr[i-1].equals(" ")){
            answer += arr[i].toUpperCase();
        }
        else answer += arr[i].toLowerCase();
        }
        return answer;
    }
}