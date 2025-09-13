package SundayPrac;

import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));    
    }
    public static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        int n=x;
        int revNum=0;
        while(n>0){
            int digit = n%10;
            revNum = revNum*10 + digit;
            n=n/10;
            // System.out.println(revNum);
        }
        if(revNum==x){
            return true;
        }
        else{
            return false;
        }

    }
}
    