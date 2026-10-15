import java.util.*;
public class majorityelement2{
    public static List<Integer> solution(int[]nums){
        int threshold = nums.length/3;
        HashMap<Integer,Integer> map = new HashMap<>();
       
        // to find the count of each value and store in map with its key in hashmap
        for(int i=0;i<nums.length;i++){
            int count = map.getOrDefault(nums[i],0)+1;
            map.put(nums[i],count);
            // storing nums[i] as value and count as key
        }

        // to store values more than one from hashmap having count more than threshold 
            
        List<Integer> list = new ArrayList<>();

        // keySet returns all key value pair of the hashmap
        for(int key:map.keySet()){
            if(map.get(key)>threshold){
                list.add(key);
            }
        }
        return list;
    }
    
     public static void main(String[] args) {
        int nums[]={1,2,3,1,2,1,2,4,2,1};
        List<Integer> ans = solution(nums);
        System.out.print(ans);
        
    }

    
}

   