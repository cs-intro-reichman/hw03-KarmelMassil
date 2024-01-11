public class LowerCase {
    public static void main (String[] args) {
        String str = args[0];
        System.out.println (lowerCase (str));
    }

    public static String lowerCase (String s) {
        String w = "";
        int l = s.length();
        for (int i = 0; i < l; i++) {
            char temp = s.charAt(i);
            if (temp >='A' && temp <= 'Z') {
                temp += 32;
                w += temp;
            } else w += temp;
        }
        return w;
    }
}
