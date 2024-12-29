package pracPRJ;

import java.io.*;
import java.util.*;

public class LoginInfo extends BusBookingSystem{
	public static void FirstPage() {
		Scanner s = new Scanner(System.in);
		System.out.println("   BUS TICKETING SYSTEM  ");
		System.out.println("--------------------------");
		System.out.println("  [1] Login  ");
		System.out.println("  [2] Register ");
		System.out.print("Enter your choice: ");
		int x=3;
		while(x>2) {
		x = s.nextInt();
        if(x==1) {
        	LogIn();	
        }
        else if(x==2) {
        	Register();
        }
        else
        	System.out.println("Please enter a valid option.");
	  }
		
	} 
	public static void Register() {
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter an username=>");
		String userName = s.next();
		System.out.print("Please enter a password=>");
		String passWord = s.next();
		try {
			FileWriter writer = new FileWriter("regInfo.txt",true);
			writer.write(userName+","+passWord+"\n");
			writer.close();
			System.out.println("Your registration is successful...");
			FirstPage();
		} catch (IOException e) {
			System.out.println("Unable to open file!");
			e.printStackTrace();
		}
	}
	public static void LogIn() {
		Scanner s = new Scanner(System.in);
		System.out.print("username=>");
		String userName = s.next();
		System.out.print("password=>");
		String passWord = s.next();
		String tempName = "";
		String tempPass = "";
		boolean found = false;
		try {
			Scanner fs = new Scanner(new File("regInfo.txt"));
			fs.useDelimiter("[,\n]");
			while(fs.hasNext() && !found) {
				tempName = fs.next();
				tempPass = fs.next();
				if(tempName.trim().equals(userName.trim()) && tempPass.trim().equals(passWord.trim())) {
					System.out.println("Login Successful...\n");
					found = true;					
					options();
				}										
			}
			if(found == false){
				System.out.println("Wrong username or password!\nPlease try again...\n");
				FirstPage();
			}
			fs.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open file!");
			e.printStackTrace();
		}
		
		
	}
	
}




