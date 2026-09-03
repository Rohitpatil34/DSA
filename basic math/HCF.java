import java.util.*;
public class HCF{
    
    
    public static void hcf(int a , int b){
        while(a>0&&b>0){
            if(a>b){
                System.out.println(a=a%b);;
            }
            else{
                System.out.println(b=b%a);
            }
        }
            if(a==0){
                System.out.println(b);
            }
            else{
                System.out.println(a);
            }
        
    }
    public static void main(String[]args){
      hcf(52,10);
    }
}