package topicWiseQuestions;

import java.util.Arrays;

public class Stock {
    public static void main(String[] args) {
        int arr[] = {13,10,20,4,51,12,45};
        int arr1[] = {8, 6, 7, 2, 5, 1, 4};
        int result = profit(arr1);
        int result1 = optimal(arr1);
        System.out.println(result1);

    }
    public static int profit(int[] prices){
        int min = Integer.MAX_VALUE;
        int left = 0;
        for(int i=0; i<prices.length-1; i++){
           if(prices[i]<min){
            min = prices[i];
            left=i;
           }
        }
        int max = prices[left];
        for(int i=left; i<prices.length; i++){
            if (prices[i]>max){
                max = prices[i];
            }
        }
        int profit = max-min;

        return profit;
    }

    //--------------------------------------------------optimal---------------------------------------------------------
    public static int optimal(int[] prices){
        int minSoFar = prices[0];
        int res = 0;

        for(int i=1; i<prices.length; i++){
        minSoFar = Math.min(minSoFar, prices[i]);
        res = Math.max(res, (prices[i]-minSoFar));

        }
        return res;
    }
}
