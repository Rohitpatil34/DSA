import java.util.*;
public class setmatrixzero{

    public static void solution(int[][]nums){
        int m = nums.length;
        int n = nums[0].length;

        boolean rows[] = new boolean[m];
        boolean col[] = new boolean[n];
        
        for(int i =0;i<m;i++){
            for(int j=0;j< n;j++){

                if(nums[i][j]==0){
                    rows[i] = true;
                    col[j] = true;
                }

            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j< n;j++){
                if(rows[i] || col[j]){
                 nums[i][j] = 0;
                    System.out.println();
                }
            }
        }


    }

    public static void main(String[] args) {
        int nums[][]={{1,2,0,4},{5,6,7,8},{9,0,11,12},{13,14,15,16}};
        solution(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }
}