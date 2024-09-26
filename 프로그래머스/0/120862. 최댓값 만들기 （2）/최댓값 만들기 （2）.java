class Solution {
    public int solution(int[] numbers) {
        int answer = numbers[0]*numbers[1];
        for(int i=0 ; i<numbers.length-1 ; i++){
            for(int k = i+1 ; k<numbers.length ; k++ ){
                if(numbers[i]*numbers[k]>answer)
                    answer = numbers[i]*numbers[k];
            }
        }
        return answer;
    }
}