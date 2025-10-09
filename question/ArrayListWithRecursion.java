package question;

import java.util.ArrayList;

public class ArrayListWithRecursion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5};
        System.out.println(list1(arr, 4, 0, new ArrayList<>()));
    }
    static ArrayList<Integer> list1(int[] arr, int target, int index, ArrayList<Integer> list){
        if(arr[index]==arr.length-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return list1(arr, 4, index+1, list);
        
    }
}
