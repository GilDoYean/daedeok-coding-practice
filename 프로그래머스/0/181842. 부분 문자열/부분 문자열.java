class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        String test = "";
        for(int i=0;i<str2.length();i++){
            
            if(str2.charAt(i)==str1.charAt(0))
            {
                test = "";
                for(int k =0;k<str1.length();k++){
                if((i+k)<str2.length()){
                    test += str2.charAt(i+k);
                }
                }
                if(test.equals(str1)){
                    answer = 1;
                }
                
            }
                
        } 
        return answer;
    }
}