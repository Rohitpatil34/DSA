public class Fibonacci{
    public static int solution(int n){
        if(n<=1){
            return n;
        }
        int last = solution(n-1);
        int slast = solution(n-2);
        return last+slast;
    }

    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}