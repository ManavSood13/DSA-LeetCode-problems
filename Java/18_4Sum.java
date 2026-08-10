import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result=new HashSet<>();
        int n=nums.length;
        if (n<4){
            return new ArrayList<>(result);
        }
        //step:1 sort the array
        Arrays.sort(nums);
        
        //step 2: loop1 for first fixxed index
        for(int i=0;i<n-1;i++){
        //step 3: loop 2 for second fixxed index
            for(int j=i+1;j<n-2;j++){
            //step 4:2 moving index 
                int left=j+1;
                int right=n-1;
            //step 4: loop 3 to compare the sum
                while(left<right){
                    long sum=(long) nums[i] + (long) nums[j] + (long) nums[left] + (long) nums[right];
                    //if sum matches the target add it in the list
                    if(sum== target){
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                    }
                    // else check greater or lesser and according to that move left or right
                    else if (sum<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }    
        }
        return new ArrayList<>(result);

    }
}