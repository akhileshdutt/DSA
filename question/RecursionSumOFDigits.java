
package question;
public class RecursionSumOFDigits {
    public static void main(String[] args) {
        int ans = DigitSum(102345);
        System.out.println(ans);
    }
    static int DigitSum(int n){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        n=n/10;
        return rem+DigitSum(n--);
          
    }
}
