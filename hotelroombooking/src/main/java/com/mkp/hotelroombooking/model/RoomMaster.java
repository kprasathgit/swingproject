package com.mkp.hotelroombooking.model;

public class RoomMaster {

	private int roomNo ,noOfPerson;
	private String roomDesc,roomType,location,status,active;
	private double roomRent ,tax;
	public int getRoomNo() {
		return roomNo;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomDesc() {
		return roomDesc;
	}
	public void setRoomDesc(String roomDesc) {
		this.roomDesc = roomDesc;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public double getRoomRent() {
		return roomRent;
	}
	public void setRoomRent(double roomRent) {
		this.roomRent = roomRent;
	}
	public int getNoOfPerson() {
		return noOfPerson;
	}
	public void setNoOfPerson(int noOfPerson) {
		this.noOfPerson = noOfPerson;
	}
	
	
	
	
	
	
}
