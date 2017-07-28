package com.amaker.entity;

public class CheckTable {
	
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
