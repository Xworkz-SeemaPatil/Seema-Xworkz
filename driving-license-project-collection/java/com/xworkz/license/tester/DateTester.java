package com.xworkz.license.tester;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

	public class DateTester {

		public static void main(String[] args) throws ParseException {
			Date date = new Date();
			System.out.println(date);

			SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
			String stringDate = format.format(date);
			System.out.println(stringDate);


			Calendar calendar=Calendar.getInstance();
			calendar.add(Calendar.DATE, -1);
			System.out.println("the previous  date is"+calendar.getTime());
			
			DateFormat format2 = new SimpleDateFormat("MM-dd-yyyy");

			Date date2 = format2.parse("07-22-2021");

			System.out.println(date2);
			
		}

	
}
