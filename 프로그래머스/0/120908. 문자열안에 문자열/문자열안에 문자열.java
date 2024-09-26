class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        String test = "";
        for(int i=0;i<str1.length();i++){
            
            if(str1.charAt(i)==str2.charAt(0))
            {
                test = "";
                for(int k =0;k<str2.length();k++){
                if((i+k)<str1.length()){
                    test += str1.charAt(i+k);
                }
                }
                if(test.equals(str2)){
                    answer = 1;
                }
                
            }
                
        } 
        
        return answer;
    }
}