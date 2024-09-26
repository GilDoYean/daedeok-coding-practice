import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

class Solution {
    public List solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(i%divisor==0){
                list.add(i);
            }
        }
        if(list.size()==0){
            list.add(-1);
        }
        Collections.sort(list);
        return list;
    }
}