public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
		        System.out.println(uniqueChars(str));
    }

    public static String uniqueChars(String str) {
        String s = "";
		int l = str.length();
	    for(int i = 0; i < l; i++) {
		    char temp = str.charAt(i);
			if(temp != ' ') {
			if(str.indexOf(temp) == i){
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
