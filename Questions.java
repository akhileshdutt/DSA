import java.util.Arrays;
public class Questions {
    public static void main(String[] args) {
        // Swappin some element of array.

        int[] arr = {1, 2, 3, 4, 5};
        swap (arr, 1, 3);
        System.out.println(Arrays.toString(arr));
        
        rev(arr);
        //max item.
        int[] arr1 = {1, 2, 3, 4, 5};

        System.out.print(max(arr1));

    }
    static void swap(int[] arr, int in1, int in2){
        int temp = arr[in1];
        arr[in1]= arr[in2];
        arr[in2]=  temp;
    }

    static void rev(int[] arr){
        int start = 0 ;
        int end = arr.length-1;

        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static int max(int[] arr1){
        int maxVal= arr1[0];
        for(int i = 0; i < arr1.length; i++ ){
            if(maxVal<arr1[i]){
                maxVal=arr1[i];
            }
        }
        return maxVal;  
    }
    
    
}
