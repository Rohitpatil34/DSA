import java.util.*;
public class repeatingandmissing{
    public static int[] solution(int []nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int repeating =0;
        int missing = 0;

        // add the nums element as key and its frequency as count 
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }

        // iterate from 1 to n and check whether the key is present if yes then its frequency is 2(repeating) if no key is present
        // then it is the missing number.

        for(int j=1;j<n;j++){
            if(map.containsKey(j)){
                if(map.get(j)==2){
                    repeating =j;
                }
            }
            else{
                missing =j;
            }
        }
        return new int[]{repeating,missing};
    }

    public static void main(String[] args) {
        int nums[]={3,5,4,1,1};
        System.out.println(Arrays.toString(solution(nums)));
    }
}