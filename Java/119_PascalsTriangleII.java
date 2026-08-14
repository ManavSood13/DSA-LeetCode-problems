import java.util.*;
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<>();
        int n=rowIndex;
        for(int i=0;i<n;i++){
            res.add(1);

            for(int j=res.size()-2;j>=0;j--){
                res.set(j+1,res.get(j)+res.get(j+1));
            }
        }
        res.add(1);
        return res;
    }
}