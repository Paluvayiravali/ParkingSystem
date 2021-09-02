package Parking;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Parking {
	
	static HashMap<Integer,Cars> carslots = new HashMap<Integer,Cars>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menulist;
		
		ParkingSlot parkingslots = new ParkingSlot(10);
		
		System.out.println("Welcome to Parking System");
		System.out.println("1.Enter parking slot");
		System.out.println("2.Leave parking slot");
		System.out.println("3.List of parking cars");
		System.out.println("4.List of slot numbers with the same car color");
		System.out.println("5.List of registration numbers with the same car color");
		System.out.println("6.Exit");
		
		do {
				System.out.println("---------------------------------");
				System.out.println("Enter an Option");
				System.out.println("---------------------------------");
				menulist = sc.nextInt();
				
			switch(menulist) {
			
			case 1:
				if(menulist == 1) {
					System.out.println("\n Enter registration number \n");
					String carregistrationNumber = sc.next();
					System.out.println("\n Enter Color \n");
					String carcolor = sc.next();
					System.out.println("\n Enter brand \n");
					String carbrand = sc.next();
					
					int carpark = parkingslots.carParkingDetails(carregistrationNumber, carcolor, carbrand);
					if(carpark==0) {
		        		System.out.println("slots not available");
					}else {
		        		System.out.println("car parked at the slot "+carpark+"");	
					}
				}
				break;
				
			case 2:
				System.out.println("Enter slot to remove");
				int removeSlot = sc.nextInt();
				parkingslots.removeSlot(removeSlot);
				System.out.println("Slot Removed Successfully");
				break;
				
			case 3:
				System.out.println("List of Parking cars");
				parkingslots.showListOfCarDetails();
				break;
				
			case 4:
				System.out.println("Enter car color");
				String carcolor = sc.next();
				parkingslots.showListOfSameCarColorDetails(carcolor);
				break;
				
			case 5:
				System.out.println("Enter car color");
				String carcolor1 = sc.next();
				parkingslots.showListCarColorRegistrationNum(carcolor1);
				break;
				
			
			case 6 :
				System.out.println("---------------------------------");
				break;
				
			default:
				System.out.println("Ivalid option.Please enter again.");
				break;
				
				}
			}while(menulist != 6); 
		  System.out.println("Thankyou for using our parking system.");
		  
		  
		
	}
	
}

