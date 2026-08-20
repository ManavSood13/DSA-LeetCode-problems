class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        //step 1: reverse full array
        reverse(nums,0,n-1);
        //step 2: revrse k elemnts
        reverse(nums,0,k-1);
        //step 3: revrse k to end of array
        reverse(nums,k,n-1);
        
    }

    void swap(int[] nums, int n1,int n2){
        int temp= nums[n1];
        nums[n1]=nums[n2];
        nums[n2]=temp;
    }
    void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}