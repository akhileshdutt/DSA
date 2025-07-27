package Recursion;

import java.util.ArrayList;

public class subSeqWithRecursion {
    public static void main(String[] args) {
        System.out.println(subset("", "abc"));
        // subset("", "abc");

        
    }
    static ArrayList<String> subset(String p, String up){             // p = processed ;  up: Unprocessed
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subset(p+ch, up.substring(1));    //   this is for taking elements
        ArrayList<String> right = subset(p, up.substring(1));       // this is ignoring element

        left.addAll(right);
        return left;
    }

// trying code by my own.


    static void sub(String processed, String unprocesed){
        if(unprocesed.isEmpty()){
            System.out.print(processed+" ");
            return;
        }
        char ch = unprocesed.charAt(0);
        sub(processed + ch, unprocesed.substring(1));
        sub(processed, unprocesed.substring(1));
    }
}
