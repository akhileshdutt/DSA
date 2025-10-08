import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();
        vector.add(32);
        vector.add(27);
        vector.add(23);
        System.out.println(vector);          // vector is exactly same as ArrayList but the main difference is that vector is synchronized. 
    }
}
