import java.util.*;
public class SecondLargest{
    public static void slargest(int[]nums){
        int largest = nums[0];
        int s_largest = Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest  ){
                s_largest = largest;
                largest = nums[i];
                
            }
            else if(nums[i]<largest && nums[i]>s_largest){
                s_largest = nums[i];
            }
        }
        System.out.println("Second Largest: "+ s_largest);
    }

    public static void main(String[] args) {
        int []nums = {1,2,4,7,7,5};
        slargest(nums);
    }
}