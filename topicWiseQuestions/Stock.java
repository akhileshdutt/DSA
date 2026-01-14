package topicWiseQuestions;

import java.util.Arrays;

public class Stock {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int result = profit(arr);
        System.out.println(result);

    }
    public static int profit(int[] prices){
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length-1; i++){
           if(prices[i]<min){
            min = prices[i];
           } else if(prices[i]-min > maxProfit){
            maxProfit = prices[i]-min;
           } 
        }
        return maxProfit;
    }
}
