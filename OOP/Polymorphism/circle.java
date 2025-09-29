package Polymorphism;

public class circle extends shape {
    @Override            // this is called annotation, used to check that function is overriding or not.
    void area(){                     // this area is overriding the parent method.
        System.out.println("area is 3.14*r^2");
    }
}
