class Solution {
    public int maxArea(int[] height) {
        int n=height.length-1;
        int area=0;
        int i=0;
        int j=n;
        while(i<j){
            if(height[i]<height[j]){
                area=Math.max(area,height[i]* (j-i));
                i++;
            }
            else{
                area=Math.max(area,height[j]* (j-i));
                j--;
            }
        }
        return area;
        
    }
}