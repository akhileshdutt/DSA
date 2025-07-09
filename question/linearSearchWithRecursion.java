public class linearSearchWithRecursion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4,23,18,23};
        int index = 0;
        System.out.println(search(arr,index,18)+"th place");
        System.out.println(searchIfExist(arr,18,index+1));

    }
    static int search(int[] arr, int index, int target){
        if(arr[index]==arr.length){
            return -1;
        }
        if(arr[index]==target ){
            return index;
        }
        else{return search(arr, index+1, target);
        }
    }
    static boolean searchIfExist(int[] arr, int target, int index){
        if(arr[index]==arr.length-1){
            return false;
        }
        return arr[index]==target || searchIfExist(arr, target, index+1);
    }
}
