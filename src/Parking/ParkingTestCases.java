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
	void CheckIfParkingSlotIsCreatedWithGivenNumOfSlots() {
		
		ParkingSlot parkingslot = new ParkingSlot(10);
		Assert.assertEquals(10,parkingslot.getparkingSlotsnum());
	}
	
	
	
	
	

	
}
