// It tells that hoe much time does the code will take to execute.

// there are 3 Method : (i)  Direct Access = O(1)
//                      (ii) Linear Search = O(n)
//                      (iii)Binary Search = O(log n)

public class time_complex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[3]);  // it takes very less time as it is Direct Access

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {  // Agar array bada ho (e.g., 1 million elements), to ye time  zyada lagega, kyunki har element check karna padega.
            
            if (arr[i] == 8) {
                found = true;
                break;
            }
        }
        System.out.println(found);

    
    }
    int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) return mid;  // Element mila
            if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return -1;  // Element nahi mila
    }
    
}
