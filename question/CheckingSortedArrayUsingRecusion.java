
package question;
public class CheckingSortedArrayUsingRecusion {
    public static void main(String[] args) {
        int[] arr = {11,22,33,42,52};
        int index = 0;
        System.out.println(sort(arr, index));

    }
    static boolean sort(int[] arr, int index){    
        if(index==arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sort(arr, index+1);
    }

}
