public class Kadane{
    public static int solution(int[]nums){
        int sum =0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            if(sum<0){
                sum =0;
            }
            maxsum = Math.max(sum,maxsum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        
    }
}