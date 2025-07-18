import java.util.Arrays;

// in this, wwe use to take a random element as pivot and campare all the element with it and, ent the smaller elements LHS and grater element RHS, and the we apply recursion both the side and sort them.


public class QuickSortWithRecursion {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,8,1,9};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort (int[] nums, int low, int hi){
        if(low>=hi){
            return;
        }
        int s= low;
        int e= hi;
        int mid = s + (e-s)/2;
        int pivot = nums[mid];

        while(s<=e){ 

            // we have written these two while loop as if the array is sorted, it will not be sorted again.

            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }

            // mainly sorting is starting from here.

            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        //  now pivit is at correct index, so now i will do recursion.

        sort(nums, low, e);
        sort(nums, s, hi);
        
    }
}
