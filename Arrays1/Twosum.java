import java.util.*;
public class Twosum{
    public static void solution(int[]nums, int Target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int difference = Target - nums[i];
            if(map.containsKey(difference)){
                System.out.println(map.get(difference)+" "+ i);
            }
            map.put(nums[i],i);
        }
    }

    public static void main(String[] args) {
        int nums[]={2, 7, 11, 15};
        int Target = 9;
        solution(nums,Target);
    }
}