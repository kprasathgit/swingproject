package com.mkp.hotelroombooking.model;

public class Outstanding  {

	private String mode, tranDate, bookingType, cancelFlag;

	private int bookingNo, opercode;

	private double paidAmount , balanceAmount;

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getTranDate() {
		return tranDate;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	public String getBookingType() {
		return bookingType;
	}

	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}

	public String getCancelFlag() {
		return cancelFlag;
	}

	public void setCancelFlag(String cancelFlag) {
		this.cancelFlag = cancelFlag;
	}

	public int getBookingNo() {
		return bookingNo;
	}

	public void setBookingNo(int bookingNo) {
		this.bookingNo = bookingNo;
	}

	public int getOpercode() {
		return opercode;
	}

	public void setOpercode(int opercode) {
		this.opercode = opercode;
	}



	private int billRefNo, noOfPersons, roomNo, approxDays, BookedPerson;
	private String doBooking, customerName, mobile, customerCode, address, type, roomType;

	private double totalAmount;

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

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public int getApproxDays() {
		return approxDays;
	}

	public void setApproxDays(int approxDays) {
		this.approxDays = approxDays;
	}

	public int getBookedPerson() {
		return BookedPerson;
	}

	public void setBookedPerson(int bookedPerson) {
		BookedPerson = bookedPerson;
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

	public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
