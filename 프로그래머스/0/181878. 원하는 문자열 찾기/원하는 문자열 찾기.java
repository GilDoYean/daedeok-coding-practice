class Solution {
    public int solution(String myString, String pat) {
        String pat2 = pat.toUpperCase();
        String myString2 = myString.toUpperCase();
        int answer = 0;
        String test = "";
        for(int i=0;i<myString2.length();i++){
            if(myString2.charAt(i)==pat2.charAt(0))
            {
                test = "";
                for(int k =0;k<pat2.length();k++){
                if((i+k)<myString2.length()){
                    test += myString2.charAt(i+k);
                }
                }
                if(test.equals(pat2)){
                    answer = 1;
                }
                
            }
                
        } 
        
        return answer;
    }
}