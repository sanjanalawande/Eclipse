//import java.util.Date;
import java.util.Calendar;
//import java.util.GregorianCalendar;
public class GregorianCalendar_ {
	GregorianCalendar_(){
		
	}
	
	public static void main(String[] args) {
		/*Date date = new Date();
		System.out.println("Date: " + date);
		int year = date.getYear();
		int currentYear = year + 1900;
		System.out.println("Year = "+ currentYear);*/
		Calendar calendar = Calendar.getInstance();
		System.out.println("CURRENT YEAR - " + calendar.get(Calendar.YEAR));
		System.out.println("CURRENT MONTH - " + calendar.get(Calendar.MONTH));
		System.out.println("CURRENT DATE - " + calendar.get(Calendar.DATE));
		
	
		System.out.println("Current time - "+ calendar.getTime());
		//Setting time to 1234567898765L
		calendar.setTimeInMillis(1234567898765L);
		System.out.println("After setting time: " + calendar.getTime());
		
		}

}
