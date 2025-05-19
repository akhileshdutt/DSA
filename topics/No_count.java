public class No_count {
    public static void main(String[] args) {
        // finding number of 3 in 1342323

        int n = 1342323;
        int count = 0 ;
        while(n>0){
            int rem = n%10;
            if(rem==3){
                count++;
            }
            n=n/10;
            // System.out.println("Current n: " + n);
        }
        System.out.println(count);
    }
}
