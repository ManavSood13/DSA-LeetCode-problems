import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for (int i=0;i<n-1;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                long sum= (long) nums[i] + (long) nums[left] + (long) nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}