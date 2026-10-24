public class Upperbound{
    public static int solution(int[]nums,int x){
        int low =0;
        int high = nums.length-1;
        int ans = nums.length;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(nums[mid]>x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int []nums={1,2,2,3};
        System.out.println(solution(nums,2));
    }
}