import java.util.*;
public class Threesum{

    public static List<List<Integer>> solution(int[]nums){
        List<List<Integer>> answer = new ArrayList<>();
        int n = nums.length;
        // if nums is less than 3 then return answer
        if(n<3){
            return answer;
        }
        // sort the array
        Arrays.sort(nums);
        // declare fixed pointer
        for(int fixed =0;fixed <n-2;fixed ++){
            // if fixed number is equal to fixed -1 then skip it 
            if(fixed>0 && nums[fixed]==nums[fixed-1]){
                continue;
            }

            // declare left and right 
            int left = fixed +1;
            int right = n-1;


            while(left<right){
                // check sum 
                long sum = (long) nums[fixed]+nums[left]+nums[right];
                // if sum <0 then increase sum and make left ++
                if(sum<0){
                    left++;
                }
                // if sum >0 then decrease sum and make right --
                else if(sum>0){
                    right--;
                }
                // if sum =0 then add sum into answer list and make left ++ and right --
                else{
                    answer.add(Arrays.asList(nums[fixed],nums[left],nums[right]));
                    left++;
                    right--;

                    // skip repeated values on left pointer
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                }
               
            }
            
        }
        return answer;

    }
    
    public static void main(String[] args) {
        int nums[]={-1, 0, 1, 2, -1, -4};
        System.out.println(solution(nums));
        
        
    }
}