public class ceileingOfNumber {
    public static void main(String[] args) {
        
    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start>=end){
            int mid = start + (end-start)/2;
            if(mid==target){
                return arr[mid];
            }
            if(mid<target){
                start = mid+1;
            }else{
                end=mid-1;
            }
        }


        return -1;
    }
}
