package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserFileOperation {
	//Create a user specific file.
	public void createFile(String Path) {		
		System.out.println("Please enter file name to create with extension, ex- filename.txt\n");	
		Scanner obj = new Scanner(System.in);
		String fileName;
		fileName = obj.nextLine();
		try {
			File myObj = new File(Path+"\\"+fileName);
			if (myObj.createNewFile()) 
			{
				System.out.println("File created: " + myObj.getName());
				System.out.println("Do you want to write into file(y/n?):");
				Scanner sc=new Scanner(System.in);
				String ch3 = sc.nextLine();
				if (ch3.toUpperCase().equals("Y"))
				{
					try {
						System.out.println("input the text that you want to write into file and Hit enter:");
						FileWriter myWriter = new FileWriter(Path+"\\"+fileName);
						Scanner scan=new Scanner(System.in);
						String data = scan.nextLine();
						myWriter.write(data);
						myWriter.close();
						System.out.println("Successfully wrote to the file.\n");
					} catch (IOException e) {
						System.out.println("An error occurred.");
						e.printStackTrace();
					}

				}
				else if(ch3.toUpperCase().equals("N"))
				{
					
				}
			} 
			else 
			{
				System.out.println("File already exists.\n");
			}
		} 
		catch (IOException e) {
			System.out.println("An error occurred.\n");
			e.printStackTrace();
		}
	}
	
	///Delete a user specific file.
	public void deleteFile(String Path) {
		System.out.println("Please enter file name to Delete with extension, ex- filename.txt\n");	
		Scanner obj = new Scanner(System.in);
		String fileName;
		fileName = obj.nextLine();
		try {
			File myObj = new File(Path+"\\"+fileName);
			
			if (!myObj.exists()) {
				System.out.println(myObj.getName() + "does not exist");
			} else if (myObj.delete()) {
				System.out.println("The file is deleted!\n");
			} else {
				System.out.println("Failed to delete the file!");
			}	
		} 
		catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
	//Read a user specific file.
	public void readFile(String Path) {
		System.out.println("Please enter file name to Read with extension, ex- filename.txt\n");	
		Scanner obj = new Scanner(System.in);
		String fileName;
		fileName = obj.nextLine();
		try {
			File myObj = new File(Path+"\\"+fileName);
			
			if (myObj.exists()) {
				try {
				Scanner myReader = new Scanner(myObj);
			      while (myReader.hasNextLine()) {
			        String data = myReader.nextLine();
			        System.out.println(data);
			      }
			      myReader.close();
				}
				catch (FileNotFoundException e) {
				      System.out.println("An error occurred in Reading File.\n");
				      e.printStackTrace();
				    }
				} else {
				System.out.println(myObj.getName() + "does not exist \n");
			}	
		} 
		catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
	//Searh a user specific file.
	public void searchFile(String Path) {
		System.out.println("Please enter FileName to Search with extension, ex- filename.txt\n");	
		Scanner obj = new Scanner(System.in);
		String fileName;
		fileName = obj.nextLine();
		try {
			File myObj = new File(Path+"\\"+fileName);
			
			if (myObj.exists()) {
				System.out.println("File :"+myObj.getName() + " is found!!\n");
			}  else {
				System.out.println("File :"+myObj.getName() + " is Not found!!\n");;
			}	
		} 
		catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}


