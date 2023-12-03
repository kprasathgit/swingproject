package com.mkp.hotelroombooking.model;

public class Service {

	private String serviceId, serviceDesc, active;
	private double serviceRate;
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceDesc() {
		return serviceDesc;
	}
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public double getServiceRate() {
		return serviceRate;
	}
	public void setServiceRate(double serviceRate) {
		this.serviceRate = serviceRate;
	}

	
}
