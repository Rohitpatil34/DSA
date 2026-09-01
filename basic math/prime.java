import java.util.*;
public class prime{
    public static void prime(int n){
        if(n<=1){
            System.out.println(n);
        }
        for(int i=2;i<n;i++){
            boolean prime = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    prime=false;
                    break;
                }
            }
            if(prime){
                System.out.print(i);
            }
        }
    }
    public static void main(String[] args) {
        prime(10);
    }
}