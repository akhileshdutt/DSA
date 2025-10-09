package question;

import java.util.Arrays;
public class Lower_bond {
    public static void main(String[] args) {
        
        int[] num1 = {1, 2, 2, 3};
        int x1=2;
        Arrays.sort(num1);
        System.out.println("lower bound of "+ x1 + " is:  " + LowerBound(num1, x1));
       
        int[] num2 = {3, 5, 8, 15, 19};
        int x2=9;
        Arrays.sort(num2);
        System.out.println("lower bound of "+ x2 + " is:  " + LowerBound(num2, x2));
    

    }

    public static int LowerBound(int[] num, int x){
        int low = 0; 
        int high = num.length - 1;
        int ans = num.length;

        while(low>=high){
            int mid = low+(high-low) / 2;
            if(num[mid]>=x){
                ans = mid;
                high = mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
