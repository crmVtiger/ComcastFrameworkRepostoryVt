package com.comcast.crm.generic.javaUtility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class javacUtility {
	
	
	public String getSystemDate() {
		
		Date dateobj=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(dateobj);
		return date;
	}

}
