class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String test = Integer.toString(x);
        int sum  = 0; 
        for(int i=0;i<test.length();i++){
            sum += Integer.parseInt(test.substring(i,i+1));
        }
        if(x%sum!=0){
            answer = false;
        }
        return answer;
    }
}