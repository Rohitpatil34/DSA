import java.util.*;
public class Intersection{
    public static void solution(int[]nums1, int[]nums2){
        ArrayList<Integer> al = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                    i++;

                }
                else if(nums1[i]>nums2[j]){
                
                    j++;
                }
                else{
                    al.add(nums1[i]);
                    i++;
                    j++;
                }
        }
        for(int a : al){
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,2,3,5};
        int nums2[] = {1,2,7};

        solution(nums1,nums2);
    }
}