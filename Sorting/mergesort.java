public class mergesort{
    
   
    public static void mergesort(int[]nums,int low,int high){
        
        if(low>=high){
            return;
        }
        int mid =(low+high)/2;
        mergesort(nums,low,mid);
        mergesort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }

    public static void merge(int[]nums,int low,int mid,int high){
        int []temp= new int[high-low+1];
        int left =low;
        int right = mid+1;
        int k=0;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp[k] = nums[left];
                left++;
            }
            else{
                temp[k]=nums[right];
                right++;
            }
            k++;
        }
        while (left<=mid) {
            temp[k]= nums[left];
            left++;
            k++;
        }
        while(right<=high){
            temp[k]=nums[right];
            right++;
            k++;
        }
        for(int i=0;i<temp.length;i++){
            nums[low+i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[]nums = {4,2,7,1,5,3};
        mergesort(nums,0,nums.length-1);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}