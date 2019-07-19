package com.kiran.cloneble;

class Address /* implements Cloneable */ {
	private String area;
	private String District;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	private String State;

	public Address(String area, String district, String state) {
		super();
		this.area = area;
		District = district;
		State = state;
	}

	/*
	 * @Override public Object clone() throws CloneNotSupportedException { // TODO
	 * Auto-generated method stub return super.clone(); }
	 */

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [area=");
		builder.append(area);
		builder.append(", District=");
		builder.append(District);
		builder.append(", State=");
		builder.append(State);
		builder.append("]");
		return builder.toString();
	}

}

class Drivers implements Cloneable {

	private int driverNumber;
	private String driverName;
	private String phoneNumber;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getDriverNumber() {
		return driverNumber;
	}

	public void setDriverNumber(int driverNumber) {
		this.driverNumber = driverNumber;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Drivers drivers = (Drivers) super.clone();
		drivers.setAddress(new Address(getAddress().getArea(), getAddress().getDistrict(), getAddress().getState()));
		return drivers;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Drivers [driverNumber=");
		builder.append(driverNumber);
		builder.append(", driverName=");
		builder.append(driverName);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", address=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}

}

public class DemoCloneble {

	public static void main(String[] args) {

		Address address = new Address("Siragate", "Tumakuru", "Karnataka");

		Drivers drivers = new Drivers();
		drivers.setDriverName("Kiran Patil V");
		drivers.setDriverNumber(97389404);
		drivers.setPhoneNumber("9738940418");
		drivers.setAddress(address);
		System.out.println(drivers);

		try {

			Drivers drivers2 = (Drivers) drivers.clone();

			if (drivers == drivers2) {
				System.out.println("Both object are refering to same memory");
			} else {
				System.out.println("Both are not refering to same memory");
			}

			/*
			 * System.out.println(drivers2);
			 * 
			 * drivers2.setDriverName("Navya Patil");
			 */

			System.out.println(drivers);
			System.out.println(drivers2);

			drivers2.getAddress().setArea("Shettihalli");
			System.out.println(drivers);
			System.out.println(drivers2);
		}

		catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}

	}

}
