public class reverseFrom1{
    public static void main(String[] args) {
        int k = 2;
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        k=k%n; // we use it to normalise if n is grater then k;
        for(int i=0; i<k;i++){
            for(int j=1; j<n;j++){
            int temp = arr[0];
                arr[j]=arr[j+1];
                arr[n]=temp;
                for(int num: arr){
                    System.out.println(num+" ");
                }
            }
        }
    }
}