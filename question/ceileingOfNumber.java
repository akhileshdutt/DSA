package question;
public class ceileingOfNumber {
    public static void main(String[] args) {
        int[] arr= {2,3,5,8,13,15,25,36,45};
        int k = search(arr, 10);
        System.out.print(k);
    }
    static int search(int[] arr, int target){
        if(target>arr[arr.length]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end =mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
            
        }
        return arr[start];
    }
}
