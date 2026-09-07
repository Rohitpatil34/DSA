public class Factorial{
    public static int numbers(int n){
        if(n<=1){
            return n;
        }
        return n* numbers(n-1);
    }
    public static void main(String[] args) {
        System.out.println(numbers(5));
    }
}