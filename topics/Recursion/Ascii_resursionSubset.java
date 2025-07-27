package Recursion;
import java.util.ArrayList;

public class Ascii_resursionSubset {
    public static void main(String[] args) {
        // char ch = 'a';
        // System.out.println(ch+0);
        // System.out.println((char)(97));
        AsciiValue("", "abc");
        System.out.println();
        System.out.println(subset("", "abc"));

    }
        static void AsciiValue(String p, String up){
            if(up.isEmpty()){
                System.out.print(p+" ");
                return;
            }
            char ch = up.charAt(0);

            AsciiValue(p+ch, up.substring(1));
            AsciiValue(p, up.substring(1));
            AsciiValue(p+(ch+0), up.substring(1));
        }

        static ArrayList<String> subset(String p, String up){             // p = processed ;  up: Unprocessed
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subset(p+ch, up.substring(1));    //   this is for taking elements
        ArrayList<String> second = subset(p, up.substring(1));       // this is ignoring element
        ArrayList<String> third = subset(p + (ch+0), up.substring(1));       // this is ignoring element


        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
