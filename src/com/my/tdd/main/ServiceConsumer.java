package com.my.tdd.main;

public class ServiceConsumer {

	private Service service;
	
	public String testService(){
		
		String r = "success";
		
		try{
			service.serviceCall();
		}catch(Exception  exp){
			r = "fail";
		}
		
		return r;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	
	
	
}
