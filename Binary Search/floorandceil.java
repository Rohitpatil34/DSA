import java.util.*;
public class floorandceil{
    public static int[] solution(int []nums, int x){
        int floor = -1;
        int ceil = -1;

        // floor

        int low =0;
        int high = nums.length-1;
        int ans = nums.length;
       
        while(low<=high){
            int mid = low +(high-low)/2;
            if(nums[mid]<=x){
                floor = nums[mid];
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        // ceil 
        low =0;
        high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]>=x){
                ceil = nums[mid];
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return new int[]{floor,ceil};
    }

    public static void main(String[] args) {
        int nums[]={3,4,4,7,8,10};
        
        System.out.println(Arrays.toString(solution(nums,5)));
    }
}