package Parking;

import java.util.HashMap;
import java.util.Map;


public class ParkingSlot {
	
	Map<Integer,Cars> carslots=new HashMap<Integer,Cars>();
	
	int parkingslots =10;
	
	public int carParkingDetails(String carregistrationNumber,String carcolor,String carbrand) {
		
		int slots=nextSlotAvailable();
		Cars cars = new Cars(carregistrationNumber,carcolor,carbrand,slots);
		carslots.put(slots, cars);
		return slots;
		
	}
	
	public int nextSlotAvailable() {
		int nextslot = 0;
		for(int i=1;i<= parkingslots;i++) {
			System.out.println("cars in parking "+carslots.size() );
			if(carslots.get(i) != null){
				System.out.println("slot availabe "+i);
			}
		}
		return nextslot;
		
	}
	void showListOfCarDetails() {
		for(int i=1;i<= parkingslots;i++) {
			if(carslots.get(i) != null)
			   {
			   System.out.println(carslots.get(i).toString());
			   }
		}
	}

}
