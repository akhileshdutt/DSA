import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a fruit name (Mango or apple): ");
        String fruit = sc.next();

        switch (fruit){
            case "Mango":
            System.out.println("King");
            break;
            case "apple":
            System.out.println("Phone");
            break;
            default:
            System.out.println("Enter valid. ");
        }
    }
}
