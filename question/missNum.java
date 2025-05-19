public class missNum {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6};
        int n = arr.length;
        for(int i=1; i<=n ; i++){
            int flex=0;
            for(int j=0; j<n; j++){
                if(arr[j]==i){
                    flex = 1;
                    break;
                }
            }
            if(flex==0){
                System.out.println(i);
            }
        }
    }
}
