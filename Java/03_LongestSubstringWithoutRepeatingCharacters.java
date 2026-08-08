import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> freq=new HashMap<>();
        int ans=0;
        int left=0;
        int right=0;
        while(right<s.length()){
            char c=s.charAt(right);
            if(!freq.containsKey(c)){
                freq.put(c,1);
                ans=Math.max(ans,right-left+1);
                right++;
            }
            else{
                freq.remove(s.charAt(left));
                left++;
            }
        }
        return ans;
    }
}