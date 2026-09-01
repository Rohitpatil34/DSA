public class reverse{
    public static void reverse(int num){
        while(num>0){
        int rem = num%10;
        int quo = num/10;
        num = quo;
        System.out.print(rem); 
        }
        
    }
    public static void main(String[] args) {
        reverse(123);
    }
}