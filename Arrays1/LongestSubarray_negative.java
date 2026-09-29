// find longest subarray with sum equals to k (positive numbers)
import java.util.*;
public class LongestSubarray_negative{
    public static int solution(int[]nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        int maxlength =0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];

            if(sum == k){
                maxlength = i+1;
            }
            if(map.containsKey(sum-k)){
                int length = i-map.get(sum-k);
                maxlength = Math.max(length,maxlength);
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxlength;
    }
    public static void main(String[] args) {
        
        int []nums= {10,5,2,7,1,-10};
        
        System.out.println(solution(nums,15));
    }
}