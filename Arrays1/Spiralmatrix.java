// Given a rectangular matrix mat of size n x m. The matrix may contain any integer values, and every row has the same number 
// of columns. Return all elements of mat in clockwise spiral order starting from the top-left cell.

// Example 1
// Input: mat = [[1, 2, 3, 4, 5], [6, 7, 8, 9, 10], [11, 12, 13, 14, 15], [16, 17, 18, 19, 20]]

// Output: [1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12]

// Explanation: The traversal first takes the top row, then the right column, then the bottom row in reverse, 
// then the left column upward. The same pattern continues for the inner remaining matrix.
import java.util.*;
public class Spiralmatrix{
    public  ArrayList<Integer> solution(int[][]nums){
        ArrayList<Integer> list = new ArrayList<>();
        int top =0;
        int bottom = nums.length-1;
        int right =nums[0].length-1;
        int left = 0;
        while(top<=bottom && left<=right){
            // from left to right
            // rows constatnt and column changing
            for(int j=left;j<=right;j++){
                list.add(nums[top][j]);
            }
            top++;

            // from top to bottom
            // rows changing and column constatnt
            for(int i=top;i<=bottom;i++){
                list.add(nums[i][right]);
            }
            right--;

            // from right to left
            // rows constatnt and column changing
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    list.add(nums[bottom][j]);
                }
                bottom--;
            }

            // from bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(nums[i][left]);
                }
                left++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][]nums={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        Spiralmatrix sm = new Spiralmatrix();
        System.out.println(sm.solution(nums));
    }
}