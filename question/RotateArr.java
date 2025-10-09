package question;

import java.util.Arrays;
public class RotateArr {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        for(int j=0; j<=k; j++){
            int temp = nums[0];
            for(int i = 0; i<n-1; i++){
                nums[i]=nums[i+1];
            }
            nums[n-1]=temp;
        }
        System.out.print(Arrays.toString(nums));
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        rotate(arr, 3);
        System.out.println();
    }


}
