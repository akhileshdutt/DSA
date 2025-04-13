import java.util.*;

public class function {
    public static void main(String[] args) {
        int sum = sum1();
        System.out.println(sum);
        int s2= sum2(21, 4);
        
        System.out.println(s2);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        String gr = greet(name);
        System.out.println(gr);
    }
    static int sum1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 :");
        int n1 = sc.nextInt();
        System.out.print("Enter Number 2 :");
        int n2 = sc.nextInt();
        return n1+n2;
    }
    static int sum2(int a, int b){                           // passing arguments
        System.out.print("Sum of sum2: ");
        return a+b;
    }

    // we can pass function in function:

    static String greet(String name){
        String message = "Hello "+name;
        return message;

    }
}
