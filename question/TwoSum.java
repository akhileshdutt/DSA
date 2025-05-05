public class TwoSum{
    public static int[] sums(int[] arr, int target){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n;j++){
                int sum = arr[i]+arr[j];
                if(sum==target){
                    System.out.println(i+" "+j);
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums={3,4,7};
        int tar = 7;
        int[] k = sums(nums, tar);
        // System.out.println(k);
    }
}