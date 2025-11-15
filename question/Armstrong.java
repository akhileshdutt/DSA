package question;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number to check if it is an Armstrong number: ");
            int num = sc.nextInt();
            int originalNum = num;
            int count = String.valueOf(num).length();
            int sum =0;
            
            for(int i=0; i<count; i++){
                int digit = num%10;
                digit = (int) Math.pow(digit, count);
                sum = sum + digit;
                num = num/10;
            }
            if(sum==originalNum){
                System.out.println(sum+" is an Armstrong number");
            }else{
                System.out.println(sum+" is not an Armstrong number");
            }
        }
}
