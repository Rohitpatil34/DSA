import java.util.Scanner;

public class reversearray{
    
    public static int[] reverse(int arr[],int l,int r){
        
        if(l>=r){
            return arr ;
        }
        swap(arr,l,r);
        return reverse(arr,l+1,r-1);
    }
    public static void swap(int arr[],int l, int r){
        
        int temp;
        temp = arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
            
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array ");
        int i = sc.nextInt();
        int []arr = new int[i];
        System.out.println("Enter the numbers");
        for(int k=0;k<arr.length;k++){
            arr[k]= sc.nextInt();
        }
        reverse(arr,0, arr.length-1);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]);
        }
    }
}