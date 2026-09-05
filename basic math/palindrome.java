import java.util.*;
public class palindrome{
    public static void palindrome(int num){
    int duplicate = num;
    int reverse=0;
        while(num>0){
            int rem = num%10;
            int quo = num/10;
             num=quo;
            reverse=(reverse*10)+rem;
        }
            if(reverse==duplicate){
            System.out.println("true");
            } else{
            System.out.println("false");
              }
        
        
    }
    public static void main(String[]args){
        palindrome(121);
    }
}