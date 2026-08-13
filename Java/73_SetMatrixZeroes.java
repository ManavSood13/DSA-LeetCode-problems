import java.util.*;
class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rowZero=new HashSet<>();
        HashSet<Integer> colZero=new HashSet<>();
        // Step 1: put the rows and coloumns with zero in hashset
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rowZero.add(i);
                    colZero.add(j);
                }
            }
        }
        // step 2: set the row to zero with zero value useing rowZero
        for(int row : rowZero){
            for(int i=0;i<matrix[0].length;i++){
                matrix[row][i]=0;
            }
        }
        // step 3: set the col to zero with zero value useing colZero
        for(int col : colZero){
            for(int i=0;i<matrix.length;i++){
                matrix[i][col]=0;
            }
        }
    }
}