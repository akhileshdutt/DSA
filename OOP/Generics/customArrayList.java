import java.util.ArrayList;
import java.util.Arrays;

public class customArrayList {

    private int data[];                                   // initiated the custom arrayList ; but this can only store the int.
    private static int DEFAULT_SIZE = 10;                 // giving the defaul size
    private int size=0;                                   // giving the initial size

    public customArrayList(){                            // these are the parameters.
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize(){
        int[] temp = new int[data.length *2];

        // copying the items in the new array.

        for(int i =0; i < data.length; i++){
            temp[i] = data[i];
        }
        data=temp;
    }

    private boolean isFull(){                            // write the name of custom ArrayList and write .isFull and it will perform the task.
        return size == data.length;
    }   

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString(){
        return "CustomArrayList{"+ "data="+
        Arrays.toString(data)+", size=" + size + '}';
    }

    public static void main(String[] args) {
        // ArrayList list = new ArrayList<>();
        // list.add(422);
        // list.remove(0);
        // list.get(1);
        // list.clone();
        // list.size();
        // list.isEmpty();
        

        // in customised ArrayList we'll make our own arrayList, go to line 5

        // now let's see cusstom ArrayList

        customArrayList list2 = new customArrayList();
        list2.add(32);
        list2.add(33);
        list2.add(34);
        list2.size();
        // return Arrays.toString(list2());
        System.out.println(list2 );


        ArrayList<Integer> list3 = new ArrayList<>();     // <Integer>, thus is known as Generics.

    }
    
}
