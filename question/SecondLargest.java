import java.util.Arrays;
public class SecondLargest {
    public static void main(String[] args) {
        int largest = 0;
        int[] arr = {2, 3, 2, 4, 6, 4, 8, 7, 8};
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest number is : "+ largest);
        int secLargest = -1; 
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=largest && arr[i]>secLargest){
                secLargest = arr[i];
            }
        }
        System.out.println("The second largest number is : "+ secLargest);
    }
}
