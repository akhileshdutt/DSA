// in this we have to skip "a" from the string and print the new string.
// logic : if the up string is empty, we will return p string, it wwill be empty first too, then we will use charAt(index) to check that element.isEqual('a') or not, if yes then we will skip and with skipping, we will charAt(index++) so that it can check other number. but if the element is not equal to 'a', then we will add that elemt in the p string. 

public class StreaamUseingRec {
    public static void main(String[] args) {
        // skip("","asdapeadadasda");
        System.out.println(skipAppNotApple("ddappdd"));
        

    }
    static void skip(String p, String up){           // p= processed ; up= unProcessed
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch=='a'){
            skip(p, up.substring(1));    //up.substring(1) creates a new string that is the original up string with its first character removed.
        }else{
            skip(p+ch, up.substring(1));
        }
    }
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if (up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
