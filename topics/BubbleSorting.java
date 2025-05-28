import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int arr[]){
        boolean swap;   // boolean is liye include kiya hai taki jab bhi array pehle se sorted rhe to bar bar scheck krne ki jaroorat na pade

        for(int i = 0 ; i<=arr.length; i++){
            swap = false;
            for(int j = 1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
                    swap = true;   
                }
            }
            if(!swap){
                break;
            }
        }
    }
}
