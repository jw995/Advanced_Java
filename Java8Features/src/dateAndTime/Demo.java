package dateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

public class Demo {
	
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();  //current date
		LocalDateTime localDateTime = LocalDateTime.now();  // current date and time
		System.out.println(localDateTime);
		
		LocalDate localDate1 = LocalDate.of(2015, 02, 20);	 // define a date
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
		DayOfWeek day = LocalDate.parse("2016-06-12").getDayOfWeek();
		boolean leapYear = LocalDate.now().isLeapYear();   // test if time is leap year
		
		// compare dates
		boolean isBefore = LocalDate.parse("2016-06-12")
				  .isBefore(LocalDate.parse("2016-06-11"));
				 
		boolean isAfter = LocalDate.parse("2016-06-12")
				  .isAfter(LocalDate.parse("2016-06-11"));
		
		LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
		LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12")
		  .with(TemporalAdjusters.firstDayOfMonth());
		
		LocalTime sixThirty = LocalTime.of(6, 30);  // define a local time
		LocalDateTime ldt = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);  // define date and time
		
		
		// time zone related
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);  // wont convert time, will only add zone info
			
		ZoneOffset offset = ZoneOffset.of("+02:00");		 
		OffsetDateTime offSetByTwo = OffsetDateTime.of(localDateTime, offset);  // wont change time also
		
		
		// period of time
		LocalDate finalDate = localDate.plus(Period.ofDays(5));
		int numOfDays = Period.between(finalDate, localDate).getDays();
		
		
		System.out.println(numOfDays);
		
	}
}
