class Solution {
    public int[] solution(int n) {
        int size;
        if(n%2==0){
            size = n/2;
        }
        else
            size = n/2 +1;
        
        int[] answer = new int[size];
        int count = 0;
        for(int i=1;i<n+1;i++){
            if(i%2==1){
                answer[count] = i;
                count ++;
            }
        }
        return answer;
    }
}