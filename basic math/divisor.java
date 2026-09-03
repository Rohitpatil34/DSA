import java.util.*;
public class divisor {
    public static void divisor(int n){
       List<Integer> list = new ArrayList<>();
       for(int i=1;i<=Math.sqrt(n);i++){
        if(n%i==0){
           list.add(i);
            if(n/i!=i){
                list.add(n/i);
            }
        }
       } 
       Collections.sort(list);
       System.out.println(list);
       
    
    }
    public static void main(String[]args){
       divisor(36);
    }
}
