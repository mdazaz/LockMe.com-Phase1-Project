package com.company;

import java.io.IOException;
import java.util.Scanner;
public class WelcomePage {
private static boolean Boolean;

public static void main(String[] args) {
	System.out.println("---------------------------------------------------------------------");
	System.out.println("\t\t W E L C O M E to Lockers Pvt. Ltd.\n\t \t Application for File Operations");
    System.out.println("\t\t Develop by :-  Mohammad Azaz ");
    System.out.println("\t\t Date: 15/07/2021");
    System.out.println("----------------------------------------------------------------------");
    short ch=0;
    String Path="./Files";
    while (true)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("*********************MAIN MENU****************************************");
    System.out.println("\n Selct an Option Below:");
    System.out.println("----------------------------------------------------------------------");
    System.out.println("[1].Retrieving the file names in an ascending order");
    System.out.println("[2].Perform Operations on File");
    System.out.println("[3].Exit from Application");
    
    ch=sc.nextShort();
    
    switch(ch)
    {
    case 1:
    	//display file in ascending order code
    	RetrieveFile rtFile=new RetrieveFile(Path);
    	rtFile.showFiles();
    	break;
    case 2:
    	short userChoice=0;
    	Boolean returnToMainMenu=false;
    	while (!returnToMainMenu) {    
    	System.out.println("*******************FILE OPERATION*********************************");
    	System.out.println("Select operation (number) you want to perform: ");
    	System.out.println("[1]. Add a file and Write data into file");
    	System.out.println("[2]. Delete a file");
    	System.out.println("[3]. Search a file");
    	System.out.println("[4]. Read a file.");
    	System.out.println("[5]. Return to main menu");
    	userChoice=sc.nextShort();
    	UserFileOperation ufo=new UserFileOperation();
    		switch(userChoice) {
    		case 1:
    			ufo.createFile(Path);
    			break;
    		case 2:
    			ufo.deleteFile (Path);
    			break;
    		case 3: 
    			ufo.searchFile (Path);
    			break;
    		case 4: 
    			ufo.readFile(Path);
    		case 5: 
    			System.out.println("--------Back to Main Menu----");
    			returnToMainMenu=true;
    			break;
    		default:
    			System.out.println("\n Please Select a valid option from above!");
    		}
    	};
    	break;
    case 3:
    	System.out.println("Thanks for using Lockedme.com services. \n    Have a good day. \n Visit Again  ");
    	System.exit(0);
        break;
     default:
    	 System.out.println("Please provide a valid input");
    	
    }
    }
    
}

}
