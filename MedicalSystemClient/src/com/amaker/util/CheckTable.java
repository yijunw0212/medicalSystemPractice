package com.amaker.util;

import java.io.Serializable;

public class CheckTable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String num;
	
	private String flag;
	
	public String getNum() {
		return num;
	}

	public String getFlag() {
		return flag;
	}

	private String presionName;
	
	
	public String getPresionName() {
		return presionName;
	}

	public void setPresionName(String presionName) {
		this.presionName = presionName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	private String type;

}
