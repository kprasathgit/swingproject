package com.mkp.hotelroombooking.model;

public class BookingView {

	private String fromDate, toDate, mobileNo , cancelled;

	public String getCancelled() {
		return cancelled;
	}

	public void setCancelled(String cancelled) {
		this.cancelled = cancelled;
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

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
