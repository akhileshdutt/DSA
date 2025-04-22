import java.util.*;
public class largestElementInArray {
    static int largestElement(int[] nums) {
        int largest = nums[0];
        for(int i=0; i<nums.length ; i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
        }
        return largest;
        }
    public static void main(String args[]){
        int[] nums1 = {3, 3, 6, 1};
        System.out.println(largestElement(nums1));
        
        int[] nums2 = {3, 3, 0, 99, -40};
        System.out.println(largestElement(nums2));
    }
    
}
