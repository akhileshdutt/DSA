
package question;
import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,6,6,6,7,8,9};
        int[] x = searchRange(arr, 6);
        System.out.println(Arrays.toString(x));
    }
    public static int[] searchRange(int[] arr, int target){
        int[] ans = new int[]{-1, -1};
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        ans[0] = start; 
        ans[1] = end;
        return ans; 
    }

    static int search(int[] arr, int target, boolean findstartIndex){
        int ans =  -1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target<arr[mid]){
                end=mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
