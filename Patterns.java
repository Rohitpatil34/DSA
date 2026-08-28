public class Patterns {
    
    // public static void main(String[] args) {
    //     for(int i=0;i<=4;i++){
    //         for(int j=0;j<=4;j++){
    //           System.out.print("*");
              
    //         }
    //         System.out.println(" ");
    //     }
    // }


    // public static void main(String[] args) {
    //     for(int i=0;i<=4;i++){
    //         for(int j=0;j<i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     for(int i=0;i<=4;i++){
    //         for(int j=0;j<i;j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }

    //    public static void main(String[] args) {
    //     for(int i=0;i<=4;i++){
    //         for(int j=0;j<i;j++){
    //             System.out.print(i);
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     for(int i=1;i<=4;i++){
    //         for(int j=4;j>=i;j--){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     for(int i=5;i>=1;i--){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     for(int i=0;i<5;i++){
    //         // Space
    //         for(int j=0;j<5-i-1;j++){
    //             System.out.print(" ");
    //         }

    //         // stars
    //         for(int k=0;k<2*i+1;k++){
    //            System.out.print("*");
    //         }
    //         // space
    //         for(int l=0;l<5-i-1;l++){
    //            System.out.print(" ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[]args){
    //     for(int i=0;i<4;i++){

    //         // Space
    //         for(int j=0;j<i;j++){
    //             System.out.print(" ");
    //         }
    //         // stars
    //         for(int k=0;k<8-(2*i+1);k++){
    //             System.out.print("*");
    //         }
            
    //         // space
    //         for(int l=0;l<i;l++){
    //             System.out.print(" ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     int start=1;
    //     for(int i=0;i<5;i++){
            
    //         if(i%2==0)
    //             start =1;
            
    //         else{
    //             start=0;
    //         }
    //         for(int j=0;j<=i;j++){
    //             System.out.print(start);
    //             start = 1- start;
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     int n=5;
    //     for(int i=1;i<=5;i++){
    //         // numbers
    //         for(int j=1;j<=i;j++){
    //             System.out.print(j);
    //         }
    //         //space
    //         for(int k=1;k<=2*(n-i);k++){
    //             System.out.print(" ");
    //         }
    //         // numbers
    //         for(int j=i;j>=1;j--){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String[] args) {
        int num =1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num=num +1;
            }
            System.out.println();
        }
    }
}
