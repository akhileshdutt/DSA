public class Func_Overloading {
    public static void main(String[] args) {

//      two function can have same name, if there parameters are different.

        fun(20);
        fun("Akhilesh");    
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
