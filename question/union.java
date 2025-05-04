import java.util.HashSet;
import java.util.*;


public class union {
    public static int[] unionArray(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int n1= nums1.length;
        int n2= nums2.length;
        for(int i = 0; i<n1; i++){
            set.add(nums1[i]);
        }
        for(int i = 0; i<n2; i++){
            set.add(nums2[i]);
        }
        int[] hash = new int[set.size()];
        int index = 0;
        for (int num : set) {
            hash[index++] = num;
        }

        return hash;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,32,42};
        int[] arr2 = {1,2,25,3,22};
        int[] k = unionArray(arr1, arr2);
        for( int num : k){
            System.out.print(num+" ");
        }

    }
}
