//in the insertion sort, first till index 0 array will b sort, then till index 1, then till index 2 and so on.
// complexity : worst case: O(N^2) {n = no. of elements}
//              (decending sorted) => {5,4,3,2,1}  , it will be the worst case.
// best case : when array is already sorted, {1,2,3,4,5}, no. of comparision = (N-1); complexity is O(N).
// why to use: better then bubble sort as, no, of swap is reduced if array is sorted. And no, of swaps are reduced as comapred to bubble sort, and it is stable, used for smaller value on N, works good when array is partially sorted. it take part in hybrid sorting algo.


public class insertionSort {
    static int[] insertion(int[] arr){
        for(int i=0; i<arr.length - 1; i++){
            for(int j=i+1; j>0; j--){
                int check = arr[j-1];
                if(arr[j]<check){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]= {5,3,4,2,1};
        int[] stored = insertion(arr);
        for(int num: stored){
            System.out.print(num+ " ");
        }
    }
}
