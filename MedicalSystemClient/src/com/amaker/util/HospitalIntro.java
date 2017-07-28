package com.amaker.util;

import java.io.Serializable;

public class HospitalIntro implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String phone;
	
	private String intro;
	
	private String address;
	
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
	
	public String getIntro() {
		return intro;
	}

	public String getAddress() {
		return address;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public void setAddress(String address) {
		this.address = address;
	}


}