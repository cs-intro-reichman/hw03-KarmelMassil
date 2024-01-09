public class Calendar1 {	
	static int dayOfMonth;   
	static int month;
	static int year;
	
	 public static void main(String args[]) {
		int count = 0;
	    int dayOfYears = 0;
		for (year = 1900; year < 2000; year++) {
			for (month = 1; month <= 12; month++) {
				for (dayOfMonth = 1; dayOfMonth <= nDaysInMonth(month, year); dayOfMonth++) {
					 dayOfYears++;
					if (dayOfYears % 7 == 0){
					    System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
						if(dayOfMonth == 1){
						count++;
						}
					}
					else{
					   System.out.println(dayOfMonth + "/" + month + "/" + year);
					}
			    }
			}
		}
		
		System.out.println("Duing the 20th century, " + count + " Sundays fell on the first day of the month");
	 }

	private static boolean isLeapYear(int year) {
	    boolean isLeapYear = ((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0));
         return isLeapYear;
	}
	 
	private static int nDaysInMonth(int month, int year) {
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
