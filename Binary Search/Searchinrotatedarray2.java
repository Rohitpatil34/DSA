public class Searchinrotatedarray2{

    public static boolean solution(int []nums , int k){
        int low =0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(nums[mid]==k){
                return true;
            }
            if(nums[mid]==nums[low] && nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            if(nums[mid]>=nums[low]){
                if(nums[low]<=k && k<=nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(nums[mid]<k && k<=nums[high]){
                    low=mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[]={7,8,1,2,3,3,3,4,5,6};
        System.out.print(solution(nums,10));
    }
}