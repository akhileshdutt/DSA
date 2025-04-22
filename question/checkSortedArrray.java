import java.util.Arrays;
// import java.util.Scanner;
public class checkSortedArrray {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 2, 5, 7, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6};

        System.out.println("Is arr1 is sorted: "+isSorted(arr1));
        System.out.println("Is arr1 is sorted: "+isSorted(arr2));        
    }
    public static boolean isSorted(int[] arr){
        
        for(int i = 1 ; i<6; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
