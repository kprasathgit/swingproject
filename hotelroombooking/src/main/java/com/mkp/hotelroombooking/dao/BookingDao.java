package com.mkp.hotelroombooking.dao;

import java.util.List;
import java.util.Map;

import com.mkp.hotelroombooking.model.Booking;
import com.mkp.hotelroombooking.model.BookingView;
import com.mkp.hotelroombooking.model.Outstanding;

public interface BookingDao {

	public void bookingSave(List<Booking> lstBooking, boolean customerExist) throws Exception;

	public List<Outstanding> getBookingDetailsWithoutCancel() throws Exception;

	public void bookingUpdateCancelFlag(int bookingNo) throws Exception;

	public double getTotalAmountForABookNo(int bookingNo) throws Exception;

	public Map<Integer, Double> getBookingNoAndTotalAmount() throws Exception;

	public List<Booking> customizedBookingView(BookingView bookingView) throws Exception;

	public List<Booking> getAllMobileNo() throws Exception;

}
