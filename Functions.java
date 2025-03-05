// Function: is a bloack off code that perform a specific task and can be called many times.


import java.util.*;

public class Functions {
    static void giveInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Name is : "+name);
    }


    static void newcall(String fname, int age){
        System.out.println(fname+" is "+age+" year old.");
    }
    
    
    public static void main(String[] args) {
        giveInfo();
        newcall("Akhilesh",22);
        newcall("rohan",21);
    }
    
}




