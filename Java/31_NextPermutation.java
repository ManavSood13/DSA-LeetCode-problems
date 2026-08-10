class Solution {
    public void nextPermutation(int[] nums) {
        int break_idx=-1;
        int next_greater=-1;
        // step 1: find the break point 
        //break point is when traversing from end and there is sudden small num
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                break_idx=i;
                break;
            }
        }
        //step 2: if there is no break point found reverse the array
        //else find the next greater element of the break point number
        //from the end

        if(break_idx==-1){
            reverse(nums,0);
        }
        else{
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[break_idx]){
                    next_greater=i;
                    break;
                }
            }
            //step 3: swap the break point and next greater
            swap(nums,break_idx,next_greater);
            //step 4: reverse the rest of the array (suffix)
            reverse(nums,break_idx+1); 
            
        } 
    }

    //swap of number in a array
    void swap(int[] nums,int n1,int n2){
        int temp=nums[n1];
        nums[n1]=nums[n2];
        nums[n2]=temp;
    }
    //reverse of array
    void reverse(int[] nums, int start){
        int end=nums.length-1;
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}
