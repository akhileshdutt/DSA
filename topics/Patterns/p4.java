package Patterns;

    //     1
    //    212                
    //   32123
    //  4321234
//     543212345 

public class p4 {
    public static void main(String[] args) {
        
        
        
        
        for(int i=1; i<=5; i++){

            for(int k=1; k<=5-i; k++){
                   System.out.print(" ");           // for spaces
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);                // for LHS digits
            }
            for(int n=2;n<=i;n++){
                System.out.print(n);                // for RHS digits
            }
            System.out.println();
        }
    }
}
