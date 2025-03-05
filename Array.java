public class Array {

    public static void main(String[] args) {
        
    
    //----------------------------- 1-D Array ---------------------------------------

    // method 1: Declaration and memory allocation
    int[] arr = new int[5]; // array size is 5, Ye array default values store karega (0 for int, null for objects).

    // Method 2: Declaration with direct Initilization, Isme values pehle se assign ho jati hain.
    int[] arr1 = {1, 2, 3, 4, 5};

    // Method 3: Using new keyword for initilazation, Yahan size specify nahi karna hota, compiler khud calculate karta hai.
    int[] arr2 = new int[]{1, 2, 3, 4, 5};

    //to access any element
    System.out.println(arr1[2]);

    //to update element
    arr2[2] = 14;
    System.out.println("hello");

    //Traversing (Printing) an Array
    for(int i=0; i<=arr2.length; i++){
        System.out.println(arr2[i]+" ");
    }

    //Traversing Using Enhanced for Loop (For-Each Loop)
    for(int num: arr2){
        System.out.println(num);   // just to print, not for modification.
    }

    

    }
}
