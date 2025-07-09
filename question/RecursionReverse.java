public class RecursionReverse {
    public static void main(String[] args) {
        int ans = rev(12345);
        System.out.println(ans);
    }
    static int rev(int n){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        System.out.print(rem);
        n=n/10;
        return rev(n);
    }
}
