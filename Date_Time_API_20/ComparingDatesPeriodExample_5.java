package Date_Time_API_20;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample_5 {

	public static void main(String[] args) {
		/*
		 * This Period class gives info about the date only, like differences and all.
		 * 
		 * For time there are some other classes [Duration] present in java8..
		 * 
		 * 
		 */
		LocalDate localDate = LocalDate.of(2018, 01, 01);
		LocalDate localDate1 = LocalDate.of(2018, 12, 31);

		/**
		 * until - Period
		 */
		Period period = localDate.until(localDate1);
		System.out.println("getDays : " + period.getDays()); // results in 30 days performs (31-1)
		System.out.println("getMonths : " + period.getMonths()); // results in 0 days (12-01)

		Period period1 = Period.ofDays(10);
		System.out.println("getDays : " + period1.getDays());
		Period period2 = Period.ofYears(20);
		System.out.println("getYears : " + period2.getYears());
		System.out.println("toTotalMonths : " + period2.toTotalMonths());
		System.out.println("getDays : " + period2.getDays());

		Period period3 = Period.between(localDate, localDate1);
		System.out.println("getDays : " + period3.getDays());
		System.out.println("getMonths : " + period3.getMonths());
		System.out.println("getYears : " + period3.getYears());

	}
}
