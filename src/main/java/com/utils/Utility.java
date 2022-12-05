package com.utils;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.lang3.RandomStringUtils;

public class Utility{
	
	
	public static String getCurrentTime() {
		
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("hh:mm:ss a");
		LocalTime time = LocalTime.now();
		return time.format(dft).toString();
	}
	public static String getrandomNumbers() {
		String randomNum = RandomStringUtils.randomNumeric(10);
		return randomNum;
		
	}
	

	
	
}
