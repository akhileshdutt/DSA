package topicWiseQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int total = sc.nextInt();
        System.out.println("Enter the elements of the array (use space to separate): ");
        int arr[] = new int[total];
        for(int i=0; i<total; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum: ");

        int target = sc.nextInt();
        int[] result = sum(arr, target);
        System.out.print("Indices: ");
        System.out.println(Arrays.toString(result));
    }
    public static int[] sum(int[] arr, int target){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i]+arr[j] == target && i!=j){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }    
}
