public class Largest{
    static void largest(int nums[]){
        int largest = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
        }
        System.out.println("Largest is: "+largest);
    }

    public static void main(String[] args) {
        
        int []nums = {3,4,6,8,9,5};
        largest(nums);
        
    }
}