public class ZerosToEnd {
    // static int zeros(int[] arr){
    //     int n = arr.length;
    //     int[] temp = new int[n];
    //     int j=0;
    //     for(int i=0; i<n; i++){
    //         if(arr[i] != 0){
    //             temp[j++] = arr[i];
    //         }
    //     }
    //     for(int i=0; i<temp.length; i++){
    //         arr[i]=temp[i];
    //     }
    //     for(int i=temp.length; i<n; i++){
    //         temp[i]=0;
    //     }
    //     return n;
    // }
    public static int[] zeros(int[] arr){
        int n=arr.length;
        int j = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
            j=i;
            break;
            }
        }
        if(j == -1)
        return arr;
        for(int i=j+1; i<n; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr1[] = {2,0,32,32,0,2,1,2,0,4};
        int[] k = zeros(arr1);
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
