
package question;
// q1) print all the number from n to 1 .
// q2) print all the number from 1 to n .


public class RecursionQ1{
    public static void main(String[] args) {
    q1(5);                                        // here i have not used SOUT b'coz we are not returning anything.
    System.out.println("");
    q2(5);  
    System.out.println("");
    q3(5);  

}
static void q1(int n){
    if(n==0){
        return;
    }
    System.out.println(n);
    q1(n-1);
    
}

static void q2(int n){
    if(n==0){
        return;
    }
    q2(n-1);
    System.out.println(n);
}
static void q3(int n){
    if(n==0){
        return;
    }
    System.out.println(n);
    q3(n-1);
    System.out.println(n);       // this is printing as this time we are returning from recursion.
}

}