public class Binarysearch{

    public static int solution(int []nums,int target){
        int low =0;
        int high = nums.length-1;
        
        
        while(low<=high){
            int mid = low +(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[]={1,3,5,7,9,11};
        System.out.println(solution(nums,11));
    }
}