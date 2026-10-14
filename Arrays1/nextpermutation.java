public class nextpermutation{
    public static void solution(int[] nums){
        int pivot =-1;
        // find pivot where nums[i]<nums[i+1]
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                 pivot = i;
                 break;
            }
        }
        // swap the pivot with the next greatest element
        if(pivot!=-1){
        for(int j=nums.length-1;j>pivot;j--){
            if(nums[j]>nums[pivot] ){
                swap(nums,j,pivot);
                break;
            }
            
        }
        }

        // reverse the numbers after pivot 
        reverse(nums,pivot+1,nums.length-1);
    }
    public static void swap(int[]nums,int nums1,int nums2){
        int temp = nums[nums1];
        nums[nums1] = nums[nums2];
        nums[nums2] = temp;
    }
    public static void reverse(int []nums,int left,int right){
        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int nums[]={1,3,2};
         solution(nums);
        for(int j=0;j<nums.length;j++){
            System.out.print(nums[j]+" ");
        }
    }
}