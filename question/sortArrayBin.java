package question;

import java.util.*;

public class sortArrayBin {
    public static void sortColors(ArrayList<Integer> nums, int n) {
        // Arrays.sort(nums);
        // return nums;
        int ctl0=0;
        int ctl1=0;
        int ctl2=0;
        // int n=nums.size();
        for(int i=0; i<n; i++){
            if(nums.get(i) == 0) ctl0++;
            if(nums.get(i) == 1) ctl1++;
            if(nums.get(i) == 2) ctl2++;
        }
        int index=0;
        for(int i=0; i<ctl0; i++) nums.set(index++, 0);
        for(int i=0; i<ctl1; i++) nums.set(index++, 1);
        for(int i=0; i<ctl2; i++) nums.set(index++, 2);
        

    }
    public static void main(String[] args) {
        int n=8;
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(new Integer[] {2,1,2,0,0,2,1,0}));
        sortColors(nums, n);
        for(int i=0; i<n; i++){
            System.out.println(nums.get(i)+" ");
        }
        System.out.println();
        
    }
}
