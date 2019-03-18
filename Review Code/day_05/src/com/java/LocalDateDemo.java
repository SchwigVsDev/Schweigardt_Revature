package com.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
//immutable
//LocalDate, LocalDateTime, LocalTIme, ZonedDateTime, Duration, Period: java.time
public class LocalDateDemo {
//Factory method: 
	public static void main(StringDemo[] args) {
		String str="2019-01-12";
		LocalDate date=LocalDate.parse(str);
		String str1="2019/01/12";
		LocalDate date5=LocalDate.parse(str1, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		LocalDate date2= LocalDate.of(2019, 1, 26);
		LocalDate date1= LocalDate.now();
		String sDate1= date1.toString(); //"2019-02-13"
		LocalDate date3=LocalDate.parse(sDate1);
		Period period= date2.until(date1); 
		System.out.println(period);
		
		
		/*System.out.println(date1);//yyyy-MM-dd: 2019-03-13
		date1.plusDays(12);
		date1=date1.withYear(2016);//2016-03-13
	
		System.out.println(date1);//2016-03-13
		LocalDate date2= LocalDate.of(2018, 12,12);
		System.out.println(date2);
		
		LocalDateTime dt1= LocalDateTime.of(2018, 11, 26, 24,0);
		*/
		ZonedDateTime zdt= ZonedDateTime.of(2018, 11, 26, 24, 0, 0, 0, ZoneId.of("Asia/Calcutta"));
	
	}

}
