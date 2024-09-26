class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String test = "";
        for(int i=0;i<my_string.length();i++){
            
            if(my_string.charAt(i)==is_suffix.charAt(0))
            {
                test = "";
                for(int k =0;k<my_string.length()-i;k++){
                    test += my_string.charAt(i+k);
                }
            }    
             if(test.equals(is_suffix))
                    answer = 1;
        } 
        return answer;
    }
}