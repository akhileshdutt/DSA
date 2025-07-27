
import java.util.*;
// Time Complexity : NlogN + N
// Space complexity: O(N)
public class HashQuestion{
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1,1,1,2,2,3};
        int k= dupli(arr1);
        for(int i=0; i<k; i++){
            System.out.println(arr1[i]+"");
        }
    }
    static int dupli(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        int k = set.size();
        int j=0;
        for(int x: set){
            arr[j++]=x;
        }
    return k;    
    }
}
