package Parking;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ParkingSlot {
	
	static HashMap<Integer,Cars> carslots = new HashMap<Integer,Cars>();
	
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
		Cars cars = new Cars(carregistrationNumber,carcolor,carbrand,slots);
		carslots.put(slots, cars);
		return slots;
		
	}
	
	public int nextSlotAvailable() {
		int nextslot = 0;
		System.out.println("cars in parking "+carslots.size() );
		for(int i=1;i<= parkingSlotsnum;i++) {
			if(carslots.get(i) == null){
				System.out.println("slot availabe "+i);
				return i;
			}
		}
		return nextslot;
		
	}
	void showListOfSameCarColorDetails(String color){

		boolean carcolorexist = false;
		
		for (Map.Entry<Integer, Cars> entry : carslots.entrySet()) {
		 if(entry.getValue().getColor().equalsIgnoreCase(color)) {
             System.out.println("slot number: " + entry.getValue().getSlotNumber());
             carcolorexist= true;
         }
		}
		if(!carcolorexist) {
            System.out.println("No car is found with given color");
        }
		
	}
	
	void showListCarColorRegistrationNum(String rgstrtnum) {
		boolean carcolorexist = false;
		for (Map.Entry<Integer, Cars> entry : carslots.entrySet()) {
			 if(entry.getValue().getColor().equalsIgnoreCase(rgstrtnum)) {
	             System.out.println("Registration number: " + entry.getValue().getRegistrationNumber());
	             carcolorexist= true;
	         }
			}
			if(!carcolorexist) {
	            System.out.println("No car is found with given color");
	        }
		
	}
	
	
	public HashMap<Integer, Cars> removeSlot(int removeSlot) {
			carslots.remove(removeSlot);
		return carslots;
	}


	void showListOfCarDetails() {
		for (Map.Entry<Integer, Cars> entry : carslots.entrySet()) {
			System.out.println("Slot number: " + entry.getValue().getSlotNumber());
			System.out.println("Registration number: " + entry.getValue().getRegistrationNumber());
			System.out.println("Color: " + entry.getValue().getColor());
			System.out.println("Brand: " + entry.getValue().getBrand());
		}
	}
	
	

}
