//class to display date in particular format
package com.cg.datetimeformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateWeekFormat {
	public static void main(String[] args) {

		Date date = new Date();// Date object creation
		SimpleDateFormat format = new SimpleDateFormat("EEEE, MMMM dd, yyyy");// Formatting date
		System.out.println(format.format(date));
	}
}