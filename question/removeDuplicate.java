package question;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.*;
public class removeDuplicate{
    // public static int get(int[] arr){
    //     Scanner in = new Scanner(System.in);
    //     ArrayList<Integer> list= new ArrayList<>();

    //     System.out.println("Enter 6 digits: ");
        
    //     int n= arr[0];
    //     for(int i=0; i<arr.length; i++){
    //         list.add(in.nextInt());
    //     }
        
    //     for(int i = 0 ; i<arr.length; i++){
    //         if(arr[i]==arr[i-1]){
    //             list.remove(arr[i-1]);
    //         }
    //     }
        

    // return 0;
    // }
    // public static void main(String[] args) {
    //     int[] arr1 = get();

    // }

    public static void main(String[] arge){
        int arr[] = {1, 1, 2, 2, 3, 4, 4, 4, 4};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate element is: " + k);
        for(int i = 0 ; i<k; i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        int n = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[n] != arr[i]){
                n++;
                arr[n]=arr[i];
            }
        }return n+1;
    }
}