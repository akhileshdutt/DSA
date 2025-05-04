public class BinarySearch {
    public static int linearSearch(int nums[], int target) {
        int n = nums.length;	
        for(int i =0; i<n; i++){
          if(nums[i]==target){
            return i;
          }
        }
    return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int t = 3;
        int k = linearSearch(arr, t);
        // for(int i=0; i<arr.length; i++){
            System.out.println(k);
        
    }
}
