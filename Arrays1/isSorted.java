public class isSorted{
    public static boolean solution(int[]nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]){
            return false;
        }
        
        }
        return true;
    }
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5};
        System.out.println(solution(nums));
    }
}