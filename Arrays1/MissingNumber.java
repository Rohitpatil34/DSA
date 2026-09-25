// Find Missing Number 

public class MissingNumber{
    public static void solution(int[]nums){
        int n = nums.length;
        int sum = (n*(n+1))/2;
        for(int i=0;i<n;i++){
            sum = sum -nums[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int nums[]={0,1,2,4,5,6};
        solution(nums);
    }
}