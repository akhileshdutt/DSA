package Recursion;

public class NumebrEg {
    //write aa function that takes in a numebr and print it
    public static void main(String[] args) {
        number(1);        
    }
    // static void number(int n){
    //     System.out.println(n);
    //     number2(2);
    // }
    // static void number2(int n){
    //     System.out.println(n);
    //     number3(3);
    // }
    // static void number3(int n){
    //     System.out.println(n);
    //     number4(4);
    // }
    // static void number4(int n){
    //     System.out.println(n);
    //     number5(5);
    // }
    // static void number5(int n){
    //     System.out.println(n);
    // }

    // insted of writting this much of code, in which every function is calling other func, add one func only that call it self and add a check that when the n==5, it breaks.

    
    static void number(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        number(n+1);
    }
}
