import java.util.*;
public class arr{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr1 = new int[5];
        // String ar = new String[5];
        arr1[0]= 32;
        arr1[1]= 22;
        arr1[2]= 42;
        // System.out.println(arr1[0]);
        // System.out.println(arr1[2]);
        // System.out.println(arr1[4]);     // give o/p as 0, not null because int is premitive datatype 

// taking array input.

        for(int i=0; i<arr1.length; i++){
            arr1[i] = in.nextInt();
        }
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]+" ");
        }
        for(int num : arr1){
            System.out.print(num+"-");
        }
    }
}
