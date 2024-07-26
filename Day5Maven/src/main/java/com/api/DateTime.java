package com.api;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZonedDateTime;

public class DateTime {

	public static void main(String[] args) {
		LocalDateTime localdate=LocalDateTime.now();
		System.out.println(localdate.getDayOfMonth()+" "+localdate.getMonth()+" "+localdate.getYear());
		Instant orderTime=Instant.now();
		System.out.println(orderTime);
		ZonedDateTime zone=ZonedDateTime.now();
		System.out.println(zone);
		Year year=Year.now();
		System.out.println(year);
		YearMonth m=YearMonth.now();
		System.out.println(m.getMonth());
		Month m1=Month.NOVEMBER;
		System.out.println(m1);
		LocalDate local=LocalDate.now();
		System.out.println(local);

	}

}
