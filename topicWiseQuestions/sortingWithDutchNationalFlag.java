package topicWiseQuestions;

import java.util.Arrays;

public class sortingWithDutchNationalFlag {
    public static void main(String[] args) {
        int arr[] = {2,2,1,0,2,0,1};
        DutchNationalFlag(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int a,int b){
            int temp = arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
    }

    public static void DutchNationalFlag(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int mid = 0;
        
        while(mid<=right){
            if(arr[mid]==2){
                swap(arr, mid, right);
                right--;
            }else if(arr[mid]==0){
                swap(arr, mid, left);
                left++;
            }else{
                mid++;
            }
        }
    }
}
