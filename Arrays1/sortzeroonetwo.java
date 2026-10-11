// Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order.

// The sorting must be done in-place, without making a copy of the original array.

// Example 1:
// Input: nums = [1, 0, 2, 1, 0]

// Output: [0, 0, 1, 1, 2]

// Explanation:

// The nums array in sorted order has 2 zeroes, 2 ones and 1 two
public class sortzeroonetwo{

    public static void solution(int[]nums){
        int curr =0;
        int left =0;
        int right =nums.length-1;
        while(curr<=right){
            if(nums[curr]==0){
                swap(nums,curr,left);
                curr++;
                left++;
            }
            else if(nums[curr]==1){
                curr++;
            }
            else{
                swap(nums,right,curr);
                right--;
            }
        }
    }
    public static void swap(int nums[],int num1, int num2){
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;

    }
    public static void main(String[] args) {
        int [] nums = {1, 0, 2, 1, 0};
        solution(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }
}