public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6};
        System.out.println(rbs(arr, 5, 0, arr.length-1));
    }
    static int rbs(int[] arr, int target, int s, int e){
        
        int mid = s+ (e-s)/2;
        if(s>e){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(target>=arr[s] && target<=arr[mid]){
                return rbs(arr, target, s, mid-1);
            }else{
                return rbs(arr, target, mid+1, e);
            }
        }
        if(target>=arr[mid] && target<=arr[e]){
            return rbs(arr, target, mid+1, e);
            
        }
        return -1;
    }
}
