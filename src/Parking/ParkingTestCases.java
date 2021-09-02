package Parking;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.jupiter.api.Test;  

class ParkingTestCases {

	
	@Test
	void checkingCarColor() {
		
		Cars cars = new Cars("123","red","innova",1);
		Assert.assertEquals("red",cars.getColor());
	}

	@Test
	void checkingCarRegistrationNumber() {
		Cars cars = new Cars("123","red","innova",1);
		Assert.assertNotSame("1234",cars.getRegistrationNumber());
		
	}
	
	@Test
	void checkingWithCarBrand() {
		Cars cars = new Cars("1234","red","benz",3);
		Assert.assertEquals("benz", cars.getBrand());
	}
	
	
	@Test
	void checkingParkingAndUnParking() {
		ParkingSlot parkingslot = new ParkingSlot(3);
		int slot = parkingslot.carParkingDetails("123", "black", "benz");
		Assert.assertEquals(1, slot);
		int slot2 = parkingslot.carParkingDetails("12344", "black", "benz");
		Assert.assertEquals(2, slot2);
		parkingslot.removeSlot(2);
		int slot3 = parkingslot.carParkingDetails("123445", "blackwerwwr", "benz");
		Assert.assertEquals(2, slot3);
		int slot4 = parkingslot.carParkingDetails("123445", "blacksf", "benz");
		Assert.assertEquals(3, slot4);

	}
	
	@Test
	void CheckIfParkingSlotIsCreatedWithGivenNumOfSlots() {
		
		ParkingSlot parkingslot = new ParkingSlot(10);
		Assert.assertEquals(10,parkingslot.getparkingSlotsnum());
	}
	
	
	
	
	

	
}
