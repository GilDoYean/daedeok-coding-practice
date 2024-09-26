import java.util.*;

class Solution {
    public List solution(String my_string) {
        List<Integer> arr = new ArrayList<>();
        for(char c : my_string.toCharArray()){
            if(c>='0' && c<='9'){
                arr.add(Character.getNumericValue(c));
            }
        }
        Collections.sort(arr);
        return arr;
    }
}