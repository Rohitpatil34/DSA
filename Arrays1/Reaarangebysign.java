// Given an integer array nums of even length consisting of an equal number of positive and negative integers.Return the answer array in such a way that the given conditions are met:

// Every consecutive pair of integers have opposite signs.
// For all integers with the same sign, the order in which they were present in nums is preserved.
// The rearranged array begins with a positive integer.
// Example 1:
// Input : nums = [2, 4, 5, -1, -3, -4]

// Output : [2, -1, 4, -3, 5, -4]

public class Reaarangebysign{
    public static void solution(int[]nums){
        int posindex=0;
        int negindex =1;
        int result[]= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                result[negindex]=nums[i];
                negindex+=2;
            }
            else{
                result[posindex] = nums[i];
                posindex+=2;
            }
        }
        for(int j=0;j<result.length;j++){
            System.out.print(result[j]+" ");
        }
        
    }
    public static void main(String[] args) {
        int nums[]={2, 4, 5, -1, -3, -4};
        solution(nums);
    }
}