public class Searchinrotatedarray{

    public static int solution(int[]nums, int k){
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==k){
                return mid;
            }
            if(nums[mid]>=nums[low]){
                if(nums[low]<=k && k<=nums[mid]){
                    high = mid -1;
                }
                else{
                    low = mid +1;
                }
            }
            else{
                if(k>nums[mid] && k<nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid -1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []nums = {4,5,6,7,0,1,2};
        System.out.print(solution(nums,0));
    }
}