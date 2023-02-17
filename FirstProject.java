package Pack1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FirstProject {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Company Name: Lockers Pvt. Ltd.");
		System.out.println("Developed By: Pushpa Sahu");
		System.out.println("Website: Lockedme.com");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println();
		int x;
		
	    while(true) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("********************");
		System.out.println("Select an option:");
		System.out.println();
		System.out.println("1. Display Files");
		System.out.println("2. Operations ");
		System.out.println("3. Close the Application");
		
		x=sc.nextInt();
		switch(x) {
		case 1:
			System.out.println("Available Files:");
			System.out.println();
			File f1=new File("C:\\Users\\Sahu\\Project1");
			String l[]=f1.list();
			ArrayList<String> al=new ArrayList<String>(Arrays.asList(l));
			Collections.sort(al);
			for(String s:al) {
				System.out.println(s);
			}
			break;
			
		case 2:
			String y;
			do {
			System.out.println("********************");	
		    System.out.println(" Select an Option:");
		    System.out.println();
			System.out.println("a. Add a New File");
			System.out.println("b. Delete a File");
			System.out.println("c. Search a File");
			System.out.println("d. Exit");
			y=sc.next();
			
			switch(y) {
			case "a":
				System.out.println("Enter File Name to add:");
				String fname=sc.next();
				
				File f2=new File("C:\\Users\\Sahu\\Project1\\"+fname);
				f2.createNewFile();
				System.out.println();
				if(f2.exists())
				   {	
				    System.out.println("file created successfully");
				   } 
				else
					System.out.println("invalid input");
				break;
			case "b":	
				System.out.println("Enter File Name to delete:");
				String fnameD=sc.next();
				File f5=new File("C:\\Users\\Sahu\\Project1");
				boolean b=false;
				for(String str: f5.list()) {
				if(str.equalsIgnoreCase(fnameD)) {
				   File f3=new File("C:\\Users\\Sahu\\Project1\\"+fnameD);
				   System.out.println();
				   f3.delete();
				   System.out.println("File deleted");
				   b=true;
				}
				}
				if(b==false)
					System.out.println("File not found");
				break;	
			case "c":
				System.out.println("Enter file name to search:");
				String fnameS=sc.next();
				File f6=new File("C:\\Users\\Sahu\\Project1");
				boolean b1=false;
				for(String st: f6.list()) {
				if(st.equalsIgnoreCase(fnameS)) {
				    System.out.println();
					System.out.println("File exists");
					b1=true;
				}
				}
				if(b1==false)
					System.out.println("File not exists");
				break;
				
			case "d":
				break;
				//go to main menu
			}	
			}while(!y.equals("d"));
			break;
		case 3:
			System.out.println("Thankyou for using the Application");
			System.exit(0);
	
		}
	    }

	}

}
