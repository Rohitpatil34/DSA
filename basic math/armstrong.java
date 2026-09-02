import java.util.*;
public class armstrong{
public static void armstrong(int num){
    if(num==0){
        System.out.println("0");
        return ;
    }
    int temp1 = num;
    int temp2 =num;

    int count =0;
    while(temp1>0){
         temp1 = temp1/10;
         count++;
    }
    
    int result=0;
    while(temp2>0){
        int rem =temp2%10;
        int quo = temp2/10;
        temp2 = quo;
        result = result+(int)Math.pow(rem,count);
        
    }
    if(result == num){
      System.out.print("TRue");
    }
    else{
        System.out.print("False");
    }
    
    }
    public static void main(String[]args){
        armstrong(153);
    }
}