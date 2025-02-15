package Java.PatternPrint;

public class DiamondShapePrint {
    public static void main(String[] arg){
        int n =6;

        // 1st Approach.....

        for (int i = 1; i <= n; i++ ){
            for(int j = n; j >=i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            for(int j = 1 ; j <=i-1 ; j++){
                System.out.print("*");
            }System.out.println();
        }
        for(int i =2;i<=n;i++){
            for (int j =1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k = i ; k <= n; k++ ){
                System.out.print("*");
            }
            for(int j = i ; j <=n-1; j++) {
                System.out.print("*");
            }System.out.println();
        }


        // Another Approach..........

        for(int i =1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print(" ");
            }for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }System.out.println();
        }for(int i =1; i<=n-1; i++){
            for (int j=0; j<=i; j++){
                System.out.print(" ");
            }for(int k=2*(n-i)-1; k>=1; k--){
                System.out.print("*");
            }System.out.println();
        }
    }
}
