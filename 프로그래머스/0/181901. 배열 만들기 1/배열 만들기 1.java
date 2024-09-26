class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int count = 0;
        for(int i=1;i<n+1;i++){
            if((k*i)<=n){
                answer[count] = k*i;
                count ++;
            }
        }
        return answer;
    }
}