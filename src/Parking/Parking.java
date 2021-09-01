package Parking;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Parking {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menulist;
		
		ParkingSlot slots = new ParkingSlot();
		
		System.out.println("Welcome to Parking System");
		System.out.println("1.Enter parking slot");
		System.out.println("2.Leave parking slot");
		System.out.println("3.List of parking cars");
		System.out.println("4.List of parking cars of same color");
		System.out.println("5.Exit");
		
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
					
					int carpark = slots.carParkingDetails(carregistrationNumber, carcolor, carbrand);
					if(carpark==0)
		        		System.out.println("slots not available");
		        	else
		        		System.out.println("car parked at the slot "+carpark+"");					
				}
				break;
				
			case 3:
				System.out.println("List of Parking cars");
				slots.showListOfCarDetails();
				
			
			case 4 :
				System.out.println("---------------------------------");
				break;
				
			default:
				System.out.println("Ivalid option.Please enter again.");
				break;
				
				}
			}while(menulist != 5); 
		  System.out.println("Thankyou for using our parking system.");
		  
		  
		
	}
	
}

