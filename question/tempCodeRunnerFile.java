public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = arr.length;
        for(int j=0 ; j<k; j++){
        int temp = arr[0];
        for(int i=1; i<n; i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    System.out.println(Arrays.toString(arr));
    }