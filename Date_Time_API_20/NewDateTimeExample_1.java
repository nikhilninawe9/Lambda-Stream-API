package Date_Time_API_20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample_1 {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		System.out.println("localDate : " + localDate);

		LocalTime localTime = LocalTime.now();
		System.out.println("localTime : " + localTime);

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime : " + localDateTime);
	}
}
