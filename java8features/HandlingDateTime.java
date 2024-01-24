package java8features;

/*created by VARSHINI K*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HandlingDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date: "+currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time: "+currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current Date & Time: "+currentDateTime);
		
		LocalDate date = LocalDate.parse("1997-10-24");
		System.out.println("Date: "+date);
		
		LocalDate date2 = LocalDate.of(2002, 4, 8);
		System.out.println("Date: "+date2);
		
		LocalDate yesterday = currentDate.minusDays(1);
		System.out.println("Yesterday's Date: "+yesterday);
		
		LocalDate tomorrow = currentDate.plusDays(1);
		System.out.println("Tomorrow's Date: "+tomorrow);
		
		System.out.println("Is Leap Year: "+currentDate.isLeapYear());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = currentDateTime.format(formatter);
		System.out.println("Date(dd-MM-yyyy) format: "+formattedDate);
		
		ZonedDateTime zonedDate = ZonedDateTime.now();
		System.out.println("Date with Zone: "+zonedDate);
		
		System.out.println("Current Zone: "+zonedDate.getZone());
		
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		
		ZonedDateTime tokyoZone = zonedDate.withZoneSameInstant(tokyo);
		System.out.println("Date(Tokyo Zone): "+tokyoZone);
	}

}
