package Stack_Queues;

public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;        // private beacuse i don't want ppl to change it, final beacuse it's constant and i don't want it to change

    int ptr = -1;

    public customStack(){                                 // this is default constructor
        this(DEFAULT_SIZE);                             // when nothing is called, it will call the parameterized constructor with default size
    }

    public customStack(int size){                            // this is object of customStack class(Line 3)
        this.data = new int[size];
        }

    private boolean isFull(){
        return ptr == data.length - 1;               // ptr is at last index
    }   
    private boolean isEmpty(){
        return ptr == -1;               // ptr is at First index.
    }   
    
    public int pop() throws Exception  {
        if(isEmpty()){
            throw new Exception("Can not pop from an empty stack");
        }
        return data[ptr--];
    }
    
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Can not peek from an empty stack");
        }
        return data[ptr];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
}
