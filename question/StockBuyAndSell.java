package question;

public class StockBuyAndSell {
   public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(sell(arr));
       }
   static int sell(int arr[]){
    int minValue = arr[0];
    int maxProfit = 0;

    for(int i=0; i<arr.length; i++){       
    if(arr[i]<minValue){
        minValue = arr[i];
    }
    else if(arr[i]-minValue > maxProfit){
        maxProfit= arr[i]-minValue;
    }
    }

    return maxProfit;
   }
}
