public class enumLearning {
    enum week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enuum constants.
        // every single one here is public, static and final member
        // since it is final we can not create child enums
        // type is 'week'
    
        week(){                                              // making a constructor
            System.out.println("Constructor is " + this);
        }
    }
     public static void main(String[] args) {
        week w1;
        w1 = week.Sunday; 
        for(week day: week.values()){           
            // System.out.println(day);
        }
        System.out.println(w1.ordinal());       // ordinal() tell the position of enum decleration.
     }
}
