public class Calendar0 {	
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	private static void nDaysInMonthTest(int year) {
		for(int i = 1; i < 13; i++){
			System.out.println("Month " + i + " has " + nDaysInMonth(i, year)+ " days");
		}
	}

	public static boolean isLeapYear(int year) {
		boolean isLeapYear = ((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0));
         return isLeapYear;
	}
	 
	public static int nDaysInMonth(int month, int year) {
		int days = 31;
		if(month == 4 || month == 6 || month == 9 || month == 11)
		 days = 30;
		else if (month == 2){
			if(isLeapYear(year)){
				days = 29;
			}
			else days = 28;
		}
		 return days;
	}
}