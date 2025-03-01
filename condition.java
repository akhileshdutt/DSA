// Types of Conditions in Java
// if statement
// if-else statement
// if-else if-else ladder
// nested if
// switch statement

import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Room no. : ");
        int room = sc.nextInt();
        if(room==1){
            System.out.println("Rohan");
        }else if(room==2){
            System.out.println("Rahul");
        }else if(room==3){
            System.out.println("Raman");
        }else{
            System.out.println("Room does not exist");
        }

        // nested loop (Ek ke andr ek)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your realtion: ");
        String relation = scanner.nextLine();
        if(relation.equals("parents")){
            System.out.println("Enter child name: ");
            String name = scanner.nextLine();
            if(name.equals("Rohan")){
                System.out.println("Way to room no. 1 ");
            }else if(name.equals("Raman")){
                System.out.println("Way to room no. 3 ");
            }else if(name.equals("Rahul")){
                System.out.println("Way to room no 2 ");
            }else{
                System.out.println("Student is not in this hotel.");
            }
        }else if(relation.equals("friend")){
            System.out.println("Entry not");
        }else{
            System.out.println("Call parents.");
        }

        // Switch Statement

        Scanner d = new Scanner(System.in);
        System.out.println("Enter day Number (between 1 to 7): ");
        int day = d.nextInt();
        switch(day){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;

        }
    
    }
}
