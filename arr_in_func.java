import java.util.Arrays;
public class arr_in_func {
    public static void main(String[] args) {
        int[] num = {1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
        }
        static void change(int[] arr){
            arr[0]=99;
    }
}
