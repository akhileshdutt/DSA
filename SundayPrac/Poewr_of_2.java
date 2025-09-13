package SundayPrac;

import java.util.*;
public class Poewr_of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int x){
        if(x<1){
            return false;
        }
        else if(x==1){
            return true;
        }
        else{
            while(x%2==0){
                x=x/2;
            }
            if(x==1){
                return true;
            }else{
                return false;
            }
        }
    }
}
