public class Task_10 {

	public static void main(String[] args) {
		int day = 12;
		int month = 11;
		int year = 1999;

		int daysInMonth = 31;

		
		boolean leap = ((((year % 100 != 0) && year % 4 == 0)) || (year % 400 == 0));
		
		
		day += 1;
		System.out.println(day + " " + month + " " + year + " ");

		switch (month) {
		case (12):
			days += 30;
		case (11):
			days += 31;
		case (10):
			days += 30;
		case (9):
			days += 31;
		case (8):
			days += 31;
		case (7):
			days += 30;
		case (6):
			days += 31;
		case (5):
			days += 30;
		case (4):
			days += 31;
		case (3):
			days += 28;
		case (2):
			days += 31;
		case (1):
			days += day;
		}

		

	}

}
