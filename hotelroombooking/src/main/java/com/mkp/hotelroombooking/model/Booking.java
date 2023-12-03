package com.mkp.hotelroombooking.model;

public class Booking {

	private int bookingNo, billRefNo, noOfPersons, roomNo, approxDays, BookedPerson, operCode;

	private String doBooking, customerName, mobile, customerCode, address, type, roomType, createdDate, createdTime,
			cancelFlag;

	private double amount;

	public int getBookingNo() {
		return bookingNo;
	}

	public void setBookingNo(int bookingNo) {
		this.bookingNo = bookingNo;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public int getBillRefNo() {
		return billRefNo;
	}

	public void setBillRefNo(int billRefNo) {
		this.billRefNo = billRefNo;
	}

	public int getNoOfPersons() {
		return noOfPersons;
	}

	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}

	public int getApproxDays() {
		return approxDays;
	}

	public void setApproxDays(int approxDays) {
		this.approxDays = approxDays;
	}

	public String getDoBooking() {
		return doBooking;
	}

	public void setDoBooking(String doBooking) {
		this.doBooking = doBooking;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getBookedPerson() {
		return BookedPerson;
	}

	public void setBookedPerson(int bookedPerson) {
		BookedPerson = bookedPerson;
	}

	public int getOperCode() {
		return operCode;
	}

	public void setOperCode(int operCode) {
		this.operCode = operCode;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getCancelFlag() {
		return cancelFlag;
	}

	public void setCancelFlag(String cancelFlag) {
		this.cancelFlag = cancelFlag;
	}

}
