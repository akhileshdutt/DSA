public class Intro_and_Concept {
    public static void main(String[] args) {
        // class : named grp of properties and function
        // we can make our own datatype using class

        Student kunal = new Student();
        kunal.rollNo = 14;
        kunal.Name = "Kunal";                                                       // insted of writing all these
        kunal.marks = 98.1f;

        System.out.println(kunal.Name);

    }
} 
class Student{                                                                       // creating class for every single student.
    int rollNo;
    String Name;                                                                     // these are class property 
    float marks;


    // we need a way to add the values of the above properties object by object.
    
    // constructor : 

    Student(){                                                                       // when we call a constructor 0 values, this will be called                   
        this.rollNo = 13;
        this.Name = "Rohan";
        this.marks = 83.3f;
    }
    Student (int rno, String Naam, float marks){                                     // when we call a constructor 3 values, this will be called
        this.rollNo = rno;
        this.Name = Naam;
        this.marks = marks;
    }

    // Constructor overloading

    Student(Student other){
        this.rollNo = other.rollNo;
        this.Name = other.Name;
        this.marks = other.marks;
    }

}
