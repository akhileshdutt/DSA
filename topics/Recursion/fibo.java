package Recursion;

public class fibo{
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
    static int fib(int n){
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
