// INheritance: In this the child class can use the properties of the parent class.

public class Inheritance{
    double l;
    double b;
    double h;
    Inheritance () {                                       // Constructor
        this.l = -1;      
        this.b = -1;      
        this.h = -1;      
    }
    Inheritance (double side) {                           // constuctor of same can be distingwished by the value we pass 
        this.l = side;      
        this.b = side;      
        this.h = side;          
    }
    Inheritance (double l, double b, double h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    Inheritance (Inheritance z){
        this.l = z.l;      
        this.b = z.b;      
        this.h = z.h;          
    }
    public void info(){
        System.out.println("printable: ");
    }
}
 