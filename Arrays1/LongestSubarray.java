// find longest subarray with sum equals to k (positive numbers)
import java.util.*;
public class LongestSubarray{
    public static int  solution(int[]nums,int k){
        int sum =0;
        int longest =0;
        int left =0;
        int right =0;
        for(right =0;right< nums.length;right++){
        
            sum += nums[right];
            while( left<= right && 
                sum>k){
                sum = sum - nums[left];
                left++;
            }
            if(sum == k){
                longest = Math.max(longest,right-left+1);
                

            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int []nums = {1,2,3,1,1,1,1,4,2,3};
        System.out.println(solution(nums,3));
    }
}