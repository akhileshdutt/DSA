
public class loops {
    //For Loop
    public static void main(String args[]){
        for(int i=0; i<=5; i++){
            System.out.println("Counting for loop "+i);
        }

        System.out.println("--------------------------------------------------------------------");
        //while Loop
        int a=0;
        while(a<=5){
            System.out.println("Printing while loops: "+a);
            a++;
        }
        System.out.println("--------------------------------------------------------------------");
        //do while loop
        int b=0;
        do{
            System.out.println("printing Do while Loop: "+b);
            b++;
        }while(b<=5);
        
        //For each loop
        System.out.println("--------------------------------------------------------------------");
        
        int[] number = {1, 2, 3, 4, 5, 6};
        for(int num : number){
            System.out.println(num);
        }
        
        // break Statement
        System.out.println("--------------------------------------------------------------------");
        
        for(int q = 1; q<=10; q++){
            if(q==5){
                break;
            }
            System.out.println(q);
        }
        
        System.out.println("--------------------------------------------------------------------");
        //Continue Statement
        
        for(int q = 1; q<=10; q++){
            if(q==5){
                continue;
            }
            System.out.println(q);
        }
        System.out.println("--------------------------------------------------------------------");
    }

}


