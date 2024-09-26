class Solution {
    public int[] solution(long n) {
        String test = String.valueOf(n);
        int[] answer = new int[test.length()];
        int count=0;
        for(int i=test.length();i>0;i--){
            answer[count] = Integer.parseInt(test.substring(i-1,i));
            count++;
        }        
        return answer;
    }
}