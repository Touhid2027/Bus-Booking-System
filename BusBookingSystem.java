package pracPRJ;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MulticastSocket;
import java.sql.Date;
import java.util.Scanner;

abstract class busBookingMethods{
	public abstract void Destinations();
	public abstract void BuyTicket();
	public abstract void TransactionHistory();
	public abstract void ViewTicket();
}
       
public class BusBookingSystem extends busBookingMethods{
	 
     private static int []availableSeats = {20,20,20,20,20};
     private String passangerName;
     private String passangerdest;
     private double passangerfare;
     private long passangerPhone;
     private boolean isPaid;
 
     public static void options() {
    	    BusBookingSystem bbs = new BusBookingSystem();
    	    Scanner s = new Scanner(System.in);
			System.out.println("   BUS TICKETING SYSTEM   ");
			System.out.println("____________________________");
			System.out.println("  [1] Destinations       ");
			System.out.println("  [2] Buy Ticket         ");
			System.out.println("  [3] Transaction History" );
			System.out.println("  [4] Exit               ");
			System.out.print("\nEnter an option:");
	    	
			int x = 5;   
			while(x>4) {
				x = s.nextInt();
				if(x==1)
					bbs.Destinations();
				else if(x==2)
					bbs.BuyTicket();
				else if(x==3)
					bbs.TransactionHistory();			    
			    else if(x==4)
			    	System.out.println("Thank you,Have a great day...");
			    else
			    	System.out.println("please enter a valid input...");
			}
     }
 	public void Destinations() {
 		Scanner s = new Scanner(System.in);
		System.out.println("     DESTINATION   |  FARE  |  SEAT    ");
		System.out.println("___________________ ________ __________");
		System.out.println("   1.)Dhaka        |   350  |   "+availableSeats[0]);
		System.out.println("   2.)Chittagong   |   300  |   "+availableSeats[1]);
		System.out.println("   3.)Rajshahi     |   700  |   "+availableSeats[2]);
		System.out.println("   4.)Khulna       |   650  |   "+availableSeats[3]);
		System.out.println("   5.)Barisal      |   950  |   "+availableSeats[4]);
		System.out.println("___________________ ________ __________");
		System.out.println("Student & Senior Citizen have 20% Discount!\n");
        System.out.println("\nPress 1 to get back to main menu...");
 		int n = s.nextInt();
 		if(n==1) {
 			options();
 		}
 		else
 			System.out.println("Thank you, have a nice day.");
		
	}	
    
	public void BuyTicket() {
 		Scanner s = new Scanner(System.in);
 		String dest[] = {"Dhaka", "Chittagong", "Rajshahi", "Khulna", "Barisal"};
 		double fare[] = {350,300,700,650,950};
		System.out.println("     DESTINATION   |  FARE  |  SEAT    ");
		System.out.println("___________________ ________ __________");
		System.out.println("   1.)Dhaka        |   350  |   "+availableSeats[0]);
		System.out.println("   2.)Chittagong   |   300  |   "+availableSeats[1]);
		System.out.println("   3.)Rajshahi     |   700  |   "+availableSeats[2]);
		System.out.println("   4.)Khulna       |   650  |   "+availableSeats[3]);
		System.out.println("   5.)Barisal      |   950  |   "+availableSeats[4]);
		System.out.println("___________________ ________ __________");
		System.out.println("Student & Senior Citizen have 20% Discount!\n");
		
		System.out.print("Passenger Name:");
		String name = s.nextLine();
		this.passangerName = name;
		System.out.print("Phone :");
		long phone = s.nextLong();
		this.passangerPhone = phone;
		System.out.print("Please enter your destination(1-5)");
		int choice = s.nextInt();
		System.out.print("How many seats do you want: ");
		int seat = s.nextInt();
		System.out.print("Are you a student or a senior citizen?[Y/N]");
		char yesNo = s.next().charAt(0);
		if(choice == 1) {
			if((availableSeats[0]-seat)<=0) {
				System.out.println("\nNot enough availabe seat for "+dest[0]+".");
				System.out.println("Redirecting to main menu...\n");
				options();
			}
			else {
			availableSeats[0] = availableSeats[0]-seat;
			this.passangerdest = dest[0];			
			if(yesNo == 'y' || yesNo == 'Y') {
				this.passangerfare = (fare[0]*seat)-((fare[0]*seat)/5);
			}
			else {
				this.passangerfare = (fare[0]*seat);
			}
		   }
		}
		
		if(choice == 2) {
			if((availableSeats[1]-seat)<=0) {
				System.out.println("\nNot enough availabe seat for "+dest[1]+".");
				System.out.println("Redirecting to main menu...\n");
				options();
			}
			else {
			availableSeats[1] = availableSeats[1]-seat;
			this.passangerdest = dest[1];
			if(yesNo == 'y' || yesNo == 'Y') {
				this.passangerfare = (fare[1]*seat)-((fare[1]*seat)/5);
			}
			else {
				this.passangerfare = (fare[1]*seat);
			}
		   }
		}
		
		if(choice == 3) {
			if((availableSeats[2]-seat)<=0) {
				System.out.println("\nNot enough availabe seat for "+dest[2]+".");
				System.out.println("Redirecting to main menu...\n");
				options();
			}
			else {
			availableSeats[2] = availableSeats[2]-seat;
			this.passangerdest = dest[2];
			if(yesNo == 'y' || yesNo == 'Y') {
				this.passangerfare = (fare[2]*seat)-((fare[2]*seat)/5);
			}
			else {
				this.passangerfare = (fare[2]*seat);
			}
		   }
		}
		
		if(choice == 4) {
			if((availableSeats[3]-seat)<=0) {
				System.out.println("\nNot enough availabe seat for "+dest[3]+".");
				System.out.println("Redirecting to main menu...\n");
				options();
			}
			else {
			availableSeats[3] = availableSeats[3]-seat;
			this.passangerdest = dest[3];
			if(yesNo == 'y' || yesNo == 'Y') {
				this.passangerfare = (fare[3]*seat)-((fare[3]*seat)/5);
			}
			else {
				this.passangerfare = (fare[3]*seat);
			}
		  }
		}
		
		if(choice == 5) {
			if((availableSeats[4]-seat)<=0) {
				System.out.println("\nNot enough availabe seat for "+dest[4]+".");
				System.out.println("Redirecting to main menu...\n");
				options();
			}
			else {
			availableSeats[4] = availableSeats[4]-seat;
			this.passangerdest = dest[4];
			if(yesNo == 'y' || yesNo == 'Y') {
				this.passangerfare = (fare[4]*seat)-((fare[4]*seat)/5);
			}
			else {
				this.passangerfare = (fare[4]*seat);
			}
		  }
		}
		if(availableSeats[choice-1]>0) {
		System.out.println("\nYour Payable ammount is "+passangerfare);
		System.out.print("Enter your ammount to pay: ");
		while(true) {
		double payment = s.nextDouble();
		if(payment<passangerfare) {
			System.out.println("Sorry Insufficient Balance...\n");
		}
		else if(payment>=passangerfare)
		{
			System.out.println("Your payment was successful...");
			isPaid = true;
			System.out.println("Here's your change "+(payment - passangerfare)+" taka\n");
			Date date = new Date(System.currentTimeMillis());
			try {
				FileWriter fr = new FileWriter("history.txt",true);
				fr.write(passangerName+","+passangerdest+","+passangerfare+","+date+"\n");
				fr.close();
			} catch (IOException e) {
				System.out.println("Unable to open file");
				e.printStackTrace();
			}
			break;
		 }	
		
		}
		ViewTicket();
	   }		
		
	} 	
	
	public void ViewTicket() {
		Scanner s = new Scanner(System.in);
		Date date = new Date(System.currentTimeMillis());
		String str = "";
		if(isPaid==true)
			str = "Paid";
		else
			str = "Not Paid";
		
           System.out.println("      PAY SLIP");
           System.out.println("--------------------");
           System.out.println("Name          : "+passangerName);
           System.out.println("Phone         : "+passangerPhone);
           System.out.println("Destination   : "+passangerdest);
           System.out.println("Date          : "+date);
           System.out.println("Fare          : "+passangerfare);
           System.out.println("Payment Status: "+str);
           System.out.println("\nPress 1 to get back to main menu...");
   		int n = s.nextInt();
   		if(n==1) {
   			options();
   		}
   		else
   			System.out.println("Thank you, have a nice day.");
		
	}

	public void TransactionHistory() {
		Scanner s = new Scanner(System.in);
		String tempName ="";
		String tempDest ="";
		String tempFare ="";
		String tempDate ="";
		System.out.println("  Name        Destination        Fare        Date");
		System.out.println("  ----        -----------        ----        ----");
		try {
			Scanner scan = new Scanner(new File("history.txt"));
			scan.useDelimiter("[,\n]");
			while(scan.hasNext()) {
				tempName = scan.next();
				tempDest = scan.next();
				tempFare = scan.next();
				tempDate = scan.next();
				System.out.println("  "+tempName.trim()+"        "+tempDest.trim()+"           "+tempFare.trim()+"        "+tempDate.trim());			
			}
						
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
		System.out.println("\nPress 1 to get back to main menu...");
		int n = s.nextInt();
		if(n==1) {
			options();
		}
		else
			System.out.println("Thank you, have a nice day.");
		
	}



	

}
