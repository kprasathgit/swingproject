package com.mkp.hotelroombooking.model;

public class OutstandingVacantReport {
	
	
	private String fromDate , toDate;
	
	private String vacantDate,roomtypename,doBooking;

	private int roomNo , approxDays,bookingNo;
	
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

	public int getBookingNo() {
		return bookingNo;
	}

	public void setBookingNo(int bookingNo) {
		this.bookingNo = bookingNo;
	}

	public String getVacantDate() {
		return vacantDate;
	}

	public void setVacantDate(String vacantDate) {
		this.vacantDate = vacantDate;
	}

	

	public String getRoomtypename() {
		return roomtypename;
	}

	public void setRoomtypename(String roomtypename) {
		this.roomtypename = roomtypename;
	}

	

	public String getDoBooking() {
		return doBooking;
	}

	public void setDoBooking(String doBooking) {
		this.doBooking = doBooking;
	}

	

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	

}
