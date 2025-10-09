package question;

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
        public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       ArrayList<Integer> list = new ArrayList<>();
       for(int i = 0; i<4; i++){
           list.add(in.nextInt());
        }
        System.out.println("Enter the number you want to search: ");
        int target = in.nextInt();
        System.out.println(list.indexOf(target));
    }
}