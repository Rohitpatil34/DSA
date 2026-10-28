import java.util.*;
public class Minimuminsortedarray{
    public static int solution(int[]nums){
        int low =0;
        int high = nums.length-1;
        int lowest = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>=nums[low]){
                lowest = Math.min(nums[low],lowest);
                low = mid+1;
            }
            else{
                lowest = Math.min(nums[mid],lowest);
                high = mid-1;
            }
        }
        return lowest;
    }
    public static void main(String[] args) {
        int nums []={4,5,6,7,0,1,2,3};
        System.out.print(solution(nums));
    }
}