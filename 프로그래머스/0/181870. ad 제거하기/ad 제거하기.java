import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(String[] strArr) {
         List<String> list = new ArrayList<>();
        for(int i=0;i<strArr.length;i++){
        if(strArr[i].contains("ad")==false){
            list.add(strArr[i]);
        }
        }
        return list;
    }
}