import java.util.*;
public class countdigit{
    public static int count(int num){
        int count=0;
        if(num==0){
            return 0;
        }
        while(num>0){
            num = num /10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("the number of digits are:" +count(14));
    }
}