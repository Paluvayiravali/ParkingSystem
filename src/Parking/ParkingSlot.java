package Parking;

import java.util.ArrayList;
import java.util.Scanner;


public class ParkingSlot {
	
	ArrayList<Cars> carslots = new ArrayList<Cars>();
	
	int parkingSlotsnum;
	
	Scanner sc = new Scanner(System.in);
	
	public ParkingSlot(int parkingSlotsnum) {
		// TODO Auto-generated constructor stub
		this.parkingSlotsnum = parkingSlotsnum;
	}
	
	public int getparkingSlotsnum() {
		return parkingSlotsnum;
	}
	

	public int carParkingDetails(String carregistrationNumber,String carcolor,String carbrand) {
		
		int slots=nextSlotAvailable();
		System.out.println(slots);
		Cars cars = new Cars(carregistrationNumber,carcolor,carbrand,slots);
		carslots.add(cars);
		return slots;
		
	}
	
	public int nextSlotAvailable() {
		int nextslot = 0;
		System.out.println("cars in parking "+carslots.size() );
		for(int i=1;i<= parkingSlotsnum;i++) {
			if(carslots.indexOf(i) != 0){
				System.out.println("slot available"+i );
				return i++;
			}
		}
		return nextslot;
		
	}
	public void showListOfSameCarColorDetails(String color) {

		boolean carcolorexist = false;
		
		for (Cars i : carslots) {
	        if (i.getColor().equals(color)) {
	        	System.out.println("Slot number: " + i.getSlotNumber());
	        	System.out.println("Registration number: " + i.getRegistrationNumber());
	        	 carcolorexist= true;
	        }
	    }
			
		if(!carcolorexist) {
            System.out.println("No car is found with given color");
        }
		
	}
	
	void showListCarColorRegistrationNum(String rgstrtnum) {
		boolean carcolorexist = false;
		for (Cars i : carslots) {
	        if (i.getRegistrationNumber().equals(rgstrtnum)) {
	        	System.out.println("Slot number: " + i.getSlotNumber());
	        	System.out.println("car color: " + i.getColor());
	        	System.out.println("Brand: " + i.getBrand());
	        	 carcolorexist= true;
	        }
	    }
			if(!carcolorexist) {
	            System.out.println("No car is found with given color");
	        }
		
	}
	
	
	void showListOfCarDetails() {
		for (Cars i : carslots) {
			System.out.println("Slot number: " + i.getSlotNumber());
			System.out.println("Registration number: " + i.getRegistrationNumber());
			System.out.println("car color: " + i.getColor());
        	System.out.println("Brand: " + i.getBrand());
		}
		
	}

	
	public void removeSlot(int removeSlot) {
		// TODO Auto-generated method stub
		carslots.remove(removeSlot);
		
	}

	
	
	

}
