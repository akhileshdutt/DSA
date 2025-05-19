// time complexity is -> O(logN)

// import java.util.Arrays;
public class binSer{
    public static void main(String[] args){
        int[] arr = {1,3,4,5,6,17,23,42,60};
        int target = -4;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length -1;
         while(start<=end){
            int mid = start + (end-start)/2 ;

            if(arr[mid] < target){
                start = mid+1;
            }else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                return mid;
            }
         }
         return -1;
    } 
}           