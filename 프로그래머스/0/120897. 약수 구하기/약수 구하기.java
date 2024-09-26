import java.util.*;

class Solution {
    public List solution(int n) {
        List<Integer> arr = new ArrayList<>();
        for(int i=1 ; i<n+1 ; i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        return arr;
    }
}