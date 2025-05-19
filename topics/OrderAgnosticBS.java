
// iska use ham tb krte h jb hame ye bas ye pata ho ki array sorted h, per ye na pata ho ki assending order hai ya descending.

public class OrderAgnosticBS {
    static int OrderAgnosBS(int[] arr, int target){
        int start =0; 
        int end  = arr.length -1;
        boolean isArc = arr[start] < arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isArc){
                if(target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {43,34,23,12,9,5,4,3,2};
        int target = 12;
        int k = OrderAgnosBS(arr, target);
        System.out.println(k);
    }
}
