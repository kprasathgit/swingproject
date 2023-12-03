package com.mkp.hotelroombooking.dao;

import java.util.List;

import com.mkp.hotelroombooking.model.Service;

public interface ServiceDao {

	public void serviceSave(Service service) throws Exception;

	public List<Service> serviceView() throws Exception;

	public void serviceUpdate(Service service) throws Exception;

	public void serviceDelete(String serviceId) throws Exception;

}
