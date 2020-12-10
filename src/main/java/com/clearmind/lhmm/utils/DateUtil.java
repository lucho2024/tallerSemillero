package com.clearmind.lhmm.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
		
	
	public static String convertirFecha(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String fechaF = sdf.format(date);
		return fechaF;
	}

}
