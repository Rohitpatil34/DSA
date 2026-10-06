// Rotate matrix by 90 degrees
// Given an N * N 2D integer matrix, rotate the matrix by 90 degrees clockwise.

// The rotation must be done in place, meaning the input 2D matrix must be modified directly.

// Example 1:
// Input: matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
// Output: matrix = [[7, 4, 1], [8, 5, 2], [9, 6, 3]]

public class rotatematrixby90{

    public static void solution(int[][]nums){
        //transpose
        for(int i=0;i<nums.length;i++){
            for(int j= i+1;j<nums.length;j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }

        for(int i=0;i<nums.length;i++){
            reverse(nums[i]);
        }
    }
    public static void reverse(int nums[]){
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int nums[][]={{1,2,3},{4,5,6},{7,8,9}};
        solution(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println(" ");
        }
    }
}