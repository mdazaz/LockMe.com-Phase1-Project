package com.company;

import java.io.File;
import java.util.Arrays;

public class RetrieveFile  {
	String filePath;
	public RetrieveFile () {
		filePath="C:\\Users\\Public\\Documents\\LockerMe\\Files";
	}
	public RetrieveFile (String filePath)
	{
		this.filePath=filePath;
	}
	public void showFiles()
	{
		try{
			
			File folder = new File(filePath);
			File[] listOfFiles = folder.listFiles();
			if(listOfFiles.length == 0) {
				System.out.println("This folder is empty");
			} else {
				System.out.println("--------Lists of Files--------");
				Arrays.sort(listOfFiles);
				for (File file : listOfFiles) {					
					if(file.isFile()) {
						System.out.println(file.getName());
					} else if (file.isDirectory()) {
		                System.out.println("Directory :" + file.getName());
		            }
				} 
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
 
	
}

