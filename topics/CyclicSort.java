// when given no. from range 1 to N , use cyclic sort, as in this you swap the the no. to the n-1 position and, this loop is run until all the numbers are sorted.
//worst case: (n-1)+N => (2n-1)
//best case: o(N)

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = {5,3,1,4,2};
       cyclic(arr);
       System.out.println(Arrays.toString(arr)); 
    }   
    static void cyclic(int arr[]){  
        int n = arr.length;
        for(int i=0; i<n;){
            int loc = arr[arr[i]];
            if(arr[i]<n && arr[i]!=loc){
                int temp = arr[i];
                arr[i] = arr[i];
                arr[loc] = temp;
            }else{
                i++;
            }
        }
    } 
}
