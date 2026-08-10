class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        int count=1;
        for(int right=0;right<nums.length;right++){
            if(nums[left]!=nums[right]){
                left++;
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                
                count++;
            }
        }
        
        return count;
    }
}