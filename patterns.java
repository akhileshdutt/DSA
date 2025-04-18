// Question : https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/


public class patterns {
    public static void main(String[] args) {
        String arr[][]= new String[5][5];

        // for(int i=0; i<5; i++){
        //     for(int j=0; j<5; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // System.out.println("Next Pattern");
        
        // for(int i =1; i<=5; i++){
        //     // System.out.println("* ");
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        // System.out.println("Next Pattern");
        
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        
        // System.out.println("Next Pattern");
        
        // for(int i= 1 ; i<=5 ; i++){
        //     for(int j = 1; j<=i; j++){
        //         // i=j;
        //         System.out.print(i+" ");    
        //     }
        //     System.out.println();
        // }
        
        // System.out.println("Next Pattern");
        
        // for(int i = 5; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        // System.out.println("Next Pattern");
        
        // for(int i=5; i>=1; i--){
        //     for(int j = 1; j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        
        // System.out.println("Next Pattern");
        
        // for(int i =0; i<=5; i++){
        //     for(int j = 5-i; j>=0; j--){
        //         System.out.print("  ");
        //     }
        //     for(int n = 1; n<=(2*i-1); n++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        // System.out.println("Next Pattern");
        
        // for(int i = 5 ; i>=1; i--){
        //     for(int j = 0; j<=5-i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int n=(2*i - 1); n>=1; n--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        System.out.println("Next Pattern");
        
        for(int i = 1 ; i<=5; i++){
            for(int j = 5-i ; j>=0; j--){
                System.out.print("  ");
            }
            for(int j = 1; j<=(2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 5 ; i>=1; i--){
            for(int j=0; j<=5-i; j++){
                System.out.print("  ");
            }
            for(int j=(2*i -1); j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Next Pattern");
        
        for(int i = 1 ; i<=5; i++){
            for(int j = 1; j<=(2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 4 ; i>=1; i--){
            for(int j=(2*i -1); j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("Next Pattern");

        int count = 1;
        for(int i=1; i<=5 ; i++){
            for(int j=1; j<=i; j++){
                count++;
                System.out.print(count%2);
            }
            System.out.println();
        }

    }
}
