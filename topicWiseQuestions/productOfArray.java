package topicWiseQuestions;

import java.util.Arrays;

public class productOfArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(product(arr)));
    }
    public static int[] product(int[] arr){
        int n = arr.length;
        int res[] = new int[n];
        for(int i=0; i<n; i++){
            int mul = 1;
            for(int j=0; j<n; j++){
                if(i!=j){
                    mul *= arr[j];
                }
                else{
                }
            }
            res[i] = mul; 
        }
        return res;
    }
}