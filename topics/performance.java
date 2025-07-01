public class performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i <= 26; i++) {               // this is O(n^2)
            char ch = (char)( 'a' + i );
            series = series + ch;
        }
        System.out.println(series);

    }
}
