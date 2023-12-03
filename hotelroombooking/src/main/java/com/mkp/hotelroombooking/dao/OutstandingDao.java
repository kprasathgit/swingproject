package com.mkp.hotelroombooking.dao;

import java.util.List;

import com.mkp.hotelroombooking.model.Outstanding;
import com.mkp.hotelroombooking.model.OutstandingBalanceReport;
import com.mkp.hotelroombooking.model.OutstandingVacantReport;
import com.mkp.hotelroombooking.model.OutstandingView;

public interface OutstandingDao {

	public void outstandingSave(Outstanding outstanding) throws Exception;

	public void outstandingUpdate(Outstanding outstanding, boolean mode) throws Exception;

	public boolean isCustomerExists(int bookingNo) throws Exception;

	public List<OutstandingView> getAllOutstandingMobileNo() throws Exception;

	public List<OutstandingView> customizedOutstandingView(OutstandingView outstandingView) throws Exception;

	public void outstandingUpdateCancelFlag(int bookingNo) throws Exception;

	public List<OutstandingBalanceReport> outstandingReportView(OutstandingBalanceReport outstandingReport)
			throws Exception;

	public List<OutstandingBalanceReport> outstandingReportDetails(int bookingNo) throws Exception;

	public String getCustomerMobileNo(String customerName) throws Exception;

	public List<OutstandingVacantReport> outstandingVacantReportView(OutstandingVacantReport outstandingVacantReport)
			throws Exception;

}
