package Parking;

public class Cars {

	private String registrationNumber;
	private String color;
	private String brand;
	private int slotNumber = 0;
	
	public Cars(String carregistrationNumber,String carcolor,String carbrand,int slotnumber) {
		registrationNumber = carregistrationNumber;
		color = carcolor;
		brand = carbrand;
		slotNumber = slotnumber;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	
	public int getSlotNumber() {
		return slotNumber;
	}

	public void setSlotNumber(int slotNumber) {
		this.slotNumber = slotNumber;
	}

	public void remove(int slotno) {
		// TODO Auto-generated method stub
		this.slotNumber = slotno;
	}

	

	

	 
}
