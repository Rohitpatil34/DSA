import java.util.*;
public class ReversePairs{

    public static int solution(int []nums){
        nums = Arrays.copyOf(nums,nums.length);
        int n = nums.length;

        // array with fewer than two values cannot form a pair
        if(n<2){
            return 0;
        }
        return mergesort(nums,0,n-1);

    }

    // count reverse pair while sorting the selected range
    public static int mergesort(int[]nums,int left, int right){
        if(left>=right){
            return 0;
        }

        int mid = left + (right-left)/2;
        int pairs =0;

        pairs += mergesort(nums,left,mid);
        pairs += mergesort(nums,mid+1,right);
        pairs += countcrosspairs(nums,left,mid,right);
        mergesortedhalves(nums,left,mid,right);

        return pairs;
    }

    // Returns cross pairs from the left half to the right half.
    public static int countcrosspairs(int []nums,int left, int mid, int right){
        int j= mid +1;
        int pairs =0;
        for(int i=left;i<=mid;i++){
            while(j<= right && nums[i]>2L*nums[j]){
                j++;
            }
            pairs = j-(mid+1);
        }
        return pairs;
    }

    // Merges two sorted halves into one sorted range.
    public static void mergesortedhalves(int[]nums,int left,int mid ,int right){
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        // Merge the smaller available value from the two halves.
        while (i <= mid && j <= right) {
            // The smaller value should be placed next in the merged range.
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        // Copy any remaining values from the left half.
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        // Copy any remaining values from the right half.
        while (j <= right) {
            temp[k++] = nums[j++];
        }
        // Write the merged values back into the selected range.
        for (int x = 0; x < temp.length; x++) {
            nums[left + x] = temp[x];
        }
    }

    public static void main(String[] args) {
        int [] nums={6,4,1,2,7};
        System.out.print(solution(nums));

    }

}