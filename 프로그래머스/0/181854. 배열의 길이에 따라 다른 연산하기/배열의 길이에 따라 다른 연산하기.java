class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        int count=0;
        if(arr.length%2==1){
            for(int i:arr){
                if(count%2==0)
                answer[count] = i + n;
                else
                answer[count] = i;
                
                count++;
            }
        }
        else if(arr.length%2==0){
            for(int i:arr){
                if(count%2==1)
                answer[count] = i + n;
                else
                     answer[count] = i;
                
                count++;
            }
        }
        return answer;
    }
}