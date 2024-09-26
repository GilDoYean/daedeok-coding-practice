class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String test = "";
        for(int i=0;i<myString.length();i++){
            if(myString.charAt(i)=='A')
                test += "B";
            else if (myString.charAt(i)=='B')
                test += "A";
        }
        answer = test.contains(pat) ? 1 : 0;
          return answer;       
        }
    }