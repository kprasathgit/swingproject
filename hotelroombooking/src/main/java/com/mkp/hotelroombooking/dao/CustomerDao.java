package com.mkp.hotelroombooking.dao;

import java.util.List;

import com.mkp.hotelroombooking.model.Customer;

public interface CustomerDao {
	
	
	public void customerSave(Customer customer) throws Exception;
	
	public List<Customer> customerView() throws Exception;
	
	public void customerDelete(String code) throws Exception;
	
	public void customerUpdate(Customer customer) throws Exception;
	public String getLastCustomerCode() throws Exception ;
	
	public List<Customer> getCustomerDetails(String customerName, String mobileNo)
			throws Exception;
	
	public List<String> getType() throws Exception;
	
	public boolean isCodeExists(String customerCode) throws Exception;
	
	public boolean isMobileNoExists(String mobileNo) throws Exception ;

}
