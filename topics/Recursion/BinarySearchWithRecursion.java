package Recursion;

public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,12,23,34,45,56,67};
        // int s=0;
        // int e=arr.length;
        int target = 45;
        System.out.println(binRec(arr, target, 0, arr.length));
    }
    static int binRec(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        
        int m = s + (e-s)/2;
        
        if(arr[m]==target){
            return m;
        }

        if(target<arr[m]){
            return binRec(arr, target, s, m-1);
        }
        return binRec(arr, target, m+1, e);
    }
}
