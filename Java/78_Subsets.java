import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(list,new ArrayList(), nums, 0);
        return list;
    }
    private void backtrack(List<List<Integer>> list,List<Integer> temp,int[] nums, int start){
        list.add(new ArrayList(temp));
        int n= nums.length;
        for(int i=start;i<n;i++){
            temp.add(nums[i]);
            backtrack(list,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}