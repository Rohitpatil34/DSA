public class Bubblesorting{
    public static int[] sort(int[]nums){
        for(int i=nums.length-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
        return nums;
    }
    public static void swap(int[]nums,int a , int b) {
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

    public static void main(String[] args) {
        int []nums = {13,46,24,52,20,9};
        int result[] = sort(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(" "+result[i]);
        }
        
    }
}