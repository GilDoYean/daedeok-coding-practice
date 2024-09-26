class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1=0;
        int sum2=0;
        for(int n : arr1){
            sum1 += n;
        }
        for(int m : arr2){
             sum2 += m;
        }
        if(arr1.length!=arr2.length){
            answer = arr1.length > arr2.length ? 1 : -1;
        }
        else if(arr1.length==arr2.length){
            if(sum1==sum2)
                answer = 0;
            else
             answer = sum1 > sum2 ? 1 : -1;
        }
        return answer;
    }
}