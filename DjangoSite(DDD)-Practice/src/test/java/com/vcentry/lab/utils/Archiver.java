package com.vcentry.lab.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

public class Archiver {

	public static void archiveScreenshot() throws IOException{
		Date date=new Date(); 
		SimpleDateFormat sdf=new SimpleDateFormat("dd-M-yyyy-hh-mm-ss"); // It has predefine format
		String name=sdf.format(date); // To convert the format to date 
		
		File src=new File("C:/Batch 256/J1_DDDTest/screenshot");
		File dst=new File("C:/Batch 256/J1_DDDTest/oldScreenshot/"+name);
		FileUtils.copyDirectory(src, dst); // To copy the src file to dst file - FileUtils - Apache corporation package, it is not in selenium 
		FileUtils.cleanDirectory(src); // To clean the original src directory 
	}
}