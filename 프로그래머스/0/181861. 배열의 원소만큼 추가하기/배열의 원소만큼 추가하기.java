class Solution {
    public int[] solution(int[] arr) {
        int sum=0;
        int count =0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i]; 
        }
        int[] answer = new int[sum];
        for(int i=0;i<arr.length;i++){
         for(int k=0;k<arr[i];k++){
             answer[count] = arr[i];
             count ++;
             }   
        }
        return answer;
    }
}