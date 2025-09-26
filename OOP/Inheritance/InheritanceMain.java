public class InheritanceMain {
    public static void main(String[] args) {
        Inheritance box = new Inheritance(10);
        Inheritance box1 = new Inheritance(box);
        
        newBox box3 = new newBox();
        newBox box4 = new newBox(4,5,7,8);
        
        System.out.println(box4.h + " "+ box4.weight + " " + box4.l + " " + box4.b);

        Inheritance box5 = new newBox(2, 4, 3, 2);        // child is using the properties of Inheritance. // this is allowed 
        System.out.println(box5.b);

        // newBox box6 = new Inheritance();      // this is not allwed as parent can't inheritant the property of child. 

    }
}
