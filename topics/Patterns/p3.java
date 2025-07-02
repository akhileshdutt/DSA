package Patterns;

//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *
//

public class p3 {
    public static void main(String[] args) {
        
        for(int i=0; i<=5; i++){
            for(int j=4; j>=i;j--){
                System.out.print(" ");
            }
            for(int n=0; n<=2*i; n++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<=4; i++){
            for(int j=0; j<=i;j++){
                System.out.print("@");
            }
            for(int n=0; n<2*i; n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
