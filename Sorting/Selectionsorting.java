public class Selectionsorting{
    public static int[] sort(int []nums){
        for(int i=0;i<nums.length;i++){
            int min = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[min]>nums[j]){
                    min=j;
                }
            }
            swap(nums,i,min);
        }
        return nums;
    }
    public static void swap(int[]nums,int a,int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
        
    }

    public static void main(String[] args) {
        int nums[]={13,24,52,20,46,9};
        int result []= sort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(result[i]);
        }
        
    }
}