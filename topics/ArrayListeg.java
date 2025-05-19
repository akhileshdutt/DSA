import java.util.*;
import java.util.ArrayList;
public class ArrayListeg{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList();
        list.add(45);
        list.add(453);
        list.add(452);
        list.add(454);
        list.add(475);
        list.add(485);
        list.add(495);
        list.add(76745);
        list.add(445);
        list.add(6454);
        list.add(645);

        System.out.println(list);  // print all in an array form
        list.set(0, 99);  // it change the 0th element to 99.
        System.out.println(list);  // print all in an array form
        list.remove(2);  // remove the element of index no.2.
        System.out.println(list);  // print all in an array form

        System.out.println(list.contains(454));  // check that does this list contain 454 in the array.

        for(int i=0; i < 5; i++){               // take as much input you want.
            list.add(in.nextInt());
        }
        System.out.println(list);
        
        for(int i=0; i < 5; i++){               // another way to print.
            list.add(list.get(i));
        }
        }
}
