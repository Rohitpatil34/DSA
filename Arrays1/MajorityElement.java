// Given an integer array nums of size n, return the majority element of the array.

// The majority element of an array is an element that appears more than n/2 times in the array. The array is guaranteed to have a majority element.

// Example 1:
// Input: nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]

// Output: 7

// Explanation:

// The number 7 appears 5 times in the 9 sized array
import java.util.*;
public class MajorityElement{
    public static int solution(int[]nums){
        HashMap<Integer,Integer> map = new HashMap<>();
       int threshold = nums.length/2;
        for(int ele=0;ele<nums.length;ele++){
            
            int count = map.getOrDefault(nums[ele], 0) + 1;
            map.put(nums[ele],count);
            if(count>threshold){
                return nums[ele];
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(solution(nums));
    }
}