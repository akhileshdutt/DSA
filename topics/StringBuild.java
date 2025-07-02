import java.util.Arrays;
public class StringBuild {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.reverse());     // reverse the string .

        String name = "Akhilesh Datt"; 
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());                  // it does not change the original value, insted it creats a new object.     
        System.out.println(name);
        System.out.println(name.indexOf('e'));    // tell the location
        System.out.println("    Akhilesh   ".strip());
        System.out.println(Arrays.toString(name.split("  ")));

    }
}
