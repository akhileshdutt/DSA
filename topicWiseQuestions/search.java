package topicWiseQuestions;
import java.util.Scanner;

public class search{
    public static void main(String[] args) {
        int[] arr= {10,20,30,40,50,60,70,80,90};
        int n= arr.length;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        // linear search

        // for(int i=0; i<n; i++){
        //     if(num==arr[i]){
        //         System.out.println(i+"th position");
        //     }
        // }

        int k = BS(arr, num);
        System.out.println(k+"th position");

        }
        public static int BS(int[] arr, int target){
            int n = arr.length;
            int left = 0;
            int right = n-1;
            while(left<right){
                int mid = left + (right-left)/2;
                if(arr[mid]==target){
                    return mid;
                }
                else if(arr[mid]<target){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
            return -1;
        }
}
