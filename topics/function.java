import java.util.*;
import java.util.Arrays;

public class function {
    int a=10; // this is eg of shadowing, as this value of a will be aplicable for whole code, and now go to line no. 12.
    public static void main(String[] args) {
        int sum = sum1();
        System.out.println(sum);
        int s2= sum2(21, 4);
        
        System.out.println(s2);

        int a= 32;      // continuing concept of shadowing as, now for this block of PSVM value of a will be 32, but not for whole block, for upcomming lines of this block, and where this block ends, from there, value of a will be again 10. We can say that new value of 'a' shadowed the value of 'a' of line 4. 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        String gr = greet(name);
        System.out.println(gr);

        fun4(34,3,4,3,4,2,2,4,5,32,2);     // go to line 43.
        multiple(2, 3, "Akhilesh", "rohan");  // go to line 48.
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
    static void fun4(int ...a){                 // this concept is known as variable length argument, it internally creats array of an integer, we use this when we don't exactly know how maany input we have to take, as you can see in line 21. 
        System.out.println(Arrays.toString(a));
    }

    static void multiple(int a, int b, String ...v){   // using this we can use multiple arguments. and in (...v), we can use anything insteed of v. 
    
        //NOTE: in multiple arguments, varArgs should be in the last.   

        System.out.println(Arrays.toString(v));
    }
}
