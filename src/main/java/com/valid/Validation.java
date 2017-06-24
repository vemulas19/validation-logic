package com.valid;

public class Validation {

	public boolean validateName(String name){
		if(name == null) {
			return false;
		}
		if(name.isEmpty()){
			return false;
		}
		return true;
	}
	
	public void test(){
		
	}
	
	public boolean mobileNumberValidation(String mobile){
		if(mobile.length() != 10) {
			return false;
		}
		return true;
	}
}
