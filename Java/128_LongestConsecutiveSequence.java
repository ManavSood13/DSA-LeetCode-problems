import java.util.HashSet;
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
       
        int max=0;
        for(int num:set){
           
            if(!set.contains(num+1)){
                 int len=1;
                  int x=num;
             while(set.contains(x-1))
                {
                    x--;
                    len++;
                }
                max=Math.max(max,len);
             }
        }
       return max;
    }
     
}
