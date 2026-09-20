public class Movezero{
    public static void  move(int[]nums ){
        int j = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                swap(nums,i,j);
                j++;
            }
            
        }
    }
    public static void swap(int []nums,int i , int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        int[]nums= {1,0,2,3,2,0,0,4,5,1};
        move(nums);
        for(int i:nums){
            System.out.println(i +" ");
        }
    }
}