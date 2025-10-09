package question;

  // Binary Search:  isme mainly ye hota h ki, kisi bhi array me koi element search krna ho to,, pehle mid element check krta h, agr same hua to vahi search khtm, or agr agr array sorted hua to ham mid ke right of left me dekhte h 
import java.util.Scanner;
import java.util.Arrays;


public class bisear{
    public static int search(int[] nums, int target){
        // Scanner sc = new Scanner(System.in);
        // target = sc.nextInt(); 

        int left = 0;
        int right = nums.length-1; 
        while(left<=right){
        int mid = left + (right-left) / 2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};

        int result1 = search(nums, 12);
        int result2 = search(nums, 2);

        System.out.println("index of 9 : " +  result1);
        System.out.println("index of 2 : " +  result2);
    }
}
