import java.util.Arrays;
import java.util.Scanner;

public class Two_dim_ar {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
    /*
     in this we talk about 2d  array and 2d array work as matrix, like
     
     1 2 3
     4 5 6
     7 8 9
     
     */

    // int[][] arr = new int[5][];  // giving length of row is compulsory.
    int[][] ar1 = {
        {1,2,3}
        ,{4,5,6},
        {7,8,9}
    };
    // for(int i=0; i<ar1.length; i++){
    //     ar1[i][j] = in.nextInt();
    // }

    // System.out.println(Arrays.toString(ar1));
    
    int[][] arry = new int[3][3];


    // int i;
    // int j;
    for(int i= 0; i<3; i++){
        for(int j=0;j<3; j++){
            arry[i][j] = in.nextInt();
        }
    }
    System.out.println("The matrix is : ");
    for(int i= 0; i<3; i++){
        for(int j=0;j<3; j++){
            System.out.print(arry[i][j]+" ");
        }
        System.out.println();
    }

    System.out.println("this is short method.");
    for(int i = 0; i<arry.length; i++){
        System.out.println(Arrays.toString(arry[i]));
    }
}
}
