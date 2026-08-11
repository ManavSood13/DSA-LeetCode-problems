class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={first(nums,target), last(nums,target)};
        return ans;
    }
    public int first(int[] nums, int target){
        int n=nums.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                right=mid-1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        if(left<n && nums[left]==target){
            return left;
        }
        return -1;
    }
    public int last(int[] nums, int target){
        int n=nums.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                left=mid+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        if(right>=0 && nums[right]==target){
            return right;
        }
        return -1;
    }
}