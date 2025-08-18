package com.comcast.crm.generic.javaUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class javacUtility {
	
	
	public String getSystemDate() {
		
		Date dateobj=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(dateobj);
		return date;
	}
	
	
	public String getRequireDate(int days)
	{
		Date dateobj=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(dateobj);
		Calendar cal = sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String getreqDate = sdf.format(cal.getTime());
		return getreqDate;
		
		
	}

}
