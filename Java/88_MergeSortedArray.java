class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int A=m-1;
        int B=n-1;
        int C=m+n-1;

        while(B>=0){
            if(A>=0 && nums1[A]>nums2[B]){
                nums1[C--]=nums1[A--];
            }
            else{
                nums1[C--]=nums2[B--];
            }
        }
    }
}