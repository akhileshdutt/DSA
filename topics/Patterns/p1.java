package Patterns;

//     *
//    **
//   ***
//  ****
// *****

public class p1 {
    public static void main(String[] args) {
        
    //run the outer loop first.
    for(int i=0; i<=5; i++){
        for(int j=4; j>=i;j--){
            System.out.print(" ");
        }
        for(int n=1; n<=i; n++){
            System.out.print("*");
        }
        System.out.println();
    }

    }
}
