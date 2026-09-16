public class insertionsort{
    public  static int[] solution(int[]nums){
        for(int i=1;i<nums.length;i++){
            int j = i; 
            
            
            while(j>0 && nums[j]<nums[j-1]){
                swap(nums,j,j-1);
                j--;
            }
        }
        return nums;
    }
    public static void swap(int[]nums,int a, int b){
        
        for(int i=0;i<nums.length;i++){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
        }
        
    }
    public static void main(String[] args) {
        int [] nums = {5,3,4,1,2};
        int result []= solution(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}