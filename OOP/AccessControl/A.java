package AccessControl;

public class A {
    private int num;                                      // these are the data memebers.
    int number;                       // this is default, when we do not define public or private, that it will 
                                      // allow using in the same package but not in different package
    String name;
    int[] arr;
    
    public int getNum(){                                 // using getter method i can print the num which is private; Getter gets the value  
        return num;
    }

public void setNum(int num){                            // setter sets the value.
        this.num=num;
    }
    public A(int num, String name){
        this.num= num;
        this.name= name;
        this.arr= new int[num]; 
    }

    
    
    
}