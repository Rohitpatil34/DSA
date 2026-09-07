public class printname{
    public static void name(int i, int n){
        if(i==n){
            return;
        }
        System.out.println("Rohit");
        name(i+1,n);
    }
    
    public static void main(String[] args) {
        name(0,3);
    }
}