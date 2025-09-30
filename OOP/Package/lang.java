package Package;

public class lang {

    int num;

    public lang(int num){
        this.num = num;
    }

    // int num;
    public int hashCode(){
        return super.hashCode();
    }

    public boolean equals(Object obj){
        return super.equals(obj);
    }

    public static void main(String[] args) {
        lang n = new lang(56);
        System.out.println(n.hashCode());
        System.out.println(n.getClass());              // we use get class to know the package location; and if we write ' n.getclass(). ' then we get so many options further.
    }

}
