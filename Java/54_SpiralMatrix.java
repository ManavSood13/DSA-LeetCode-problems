import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans= new ArrayList<>();
        //if matrix is empty return empty list
        if(matrix.length==0) return ans;
        //initialize left right top bottom variables
        int left=0;
        int right=matrix[0].length-1;//it is the number of elements in each sub array
        //in example 2 there are 4 elements
        int top=0;
        int bottom=matrix.length-1;//it is the number of sub array
        //in example 2 there are 3 aub array
        while(left<=right && top<=bottom){
            //triverse from left to right
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);//top is fixxed
            }
            top++;//incriment the top to next row
            //triverse from top right to bottom right
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);//right is fixxed
            }
            right--;//decriment the right as that phile is triversed
            //triverse from bottom right to bottom left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);//bottom is fixxed
                }
                bottom--;//decriment the bottom as the row is tiversed
            }
            //triverse from bottom left to top left
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);//left is fixxed
                }
                left++;//incriment the left to next phile
            }
        }
        return ans;
    }
}