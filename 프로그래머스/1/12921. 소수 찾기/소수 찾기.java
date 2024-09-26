class Solution {
    public int solution(int n) {
        int answer = 0;

        boolean[] arr = new boolean[n+1];
        arr[0] = arr[1] = false;
        for(int i=2; i<=n; i++){
            arr[i] = true;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(arr[i]==true){
                for(int j=i*i; j<=n; j+=i){
                    arr[j] = false;  //제곱수가 약수인 경우 + 약수가 2개 이상인 수 제거
                }
            }
        }
        
        for(int i=0; i<=n; i++){
            if(arr[i]==true){
                answer++;
            }
        }

        return answer;
    }
}
