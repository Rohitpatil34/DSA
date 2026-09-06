import java.util.Scanner;

public class palindrome{
    public static boolean check(String str,int i,int n){
        
        if(i>=n/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(n-i-1)){
            return false;
        }
        return check(str,i+1,n);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of string: ");
        int n = sc.nextInt();
        System.out.println("Enter the String: ");
        String str = sc.next();
        // for(int i=0;i<str.length;i++){
        //     String str = sc.next();
        // }
        

        
        boolean ispalindrome = check(str, 0, n);
        System.out.println("Is Palindrome: "ispalindrome);
    }
}