/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
		        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String str) {
        String s = "";
		int l = str.length();
	    for(int i = 0; i < l; i++) {
		    char temp = str.charAt(i);
			if(temp != ' ') {
			if(str.indexOf(d) == i){
				s += temp;
			}
			}
			else {
				s += ' ';
			}
		}
		return s;
	}
}
