package topicWiseQuestions;

import java.util.*;

public class sorting {
    public static void main(String[] args) {
        int[] nums = {5,7,3,8,2,1,9,0,4,3,6,3};
        int n = nums.length-1;


        // bubble sort : compare adjacent value and swap
        // for(int pass=0; pass<n; pass++){
        // for(int i=0; i<n; i++){
        //     if(nums[i]>nums[i+1]){
        //         swap(nums, i, i+1);
        //     }
        // }
        // }
        // System.out.println(Arrays.toString(nums));

        // int[] sorted = selection(nums);
        // System.out.println(Arrays.toString(sorted));

        Arrays.sort(nums);                            // Array library function.
        System.out.println(Arrays.toString(nums));


    }
    public static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    // selection sort = Har pass me smallest element find karo aur starting me place karo.
    public static int[] selection(int[] nums){
        int n = nums.length;
        for(int i=0; i<n; i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[minIndex]){
                    minIndex = j;
                }
            }
            swap(nums,minIndex, i);
        }
        return nums;
    }

    // insertetion sort = Cards jaisa sorting. Ek element uthao, usko correct position me insert karo.
    // merge sort = array ko half me divide kr ke, dono part ko sort kro, fir dono array ke first elements ko check kro, or main array me put krte jao
    
    // Quick Sort =  ek value lo(mostly we take last element), jisko ham bolenge pivot, or poore array me check krnege ki kon se element usse chote hai or kon se usse bade h, to fir ye hone k bas ham chote or bade element wale array ko sort krenge, fir last me chote element array ke elements ko pivot ke aage put krenge or bado ko last me

// Situation	               Use this

// Small array	              Insertion
// Nearly sorted	          Insertion
// Fast general	              Quick
// Guaranteed worst-case	  Heap / Merge
// Stable sorting	          Merge
// Low memory	              Heap
// Java built-in	          Arrays.sort




}
