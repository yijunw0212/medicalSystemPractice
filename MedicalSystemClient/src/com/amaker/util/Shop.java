package com.amaker.util;

import android.os.Parcel;
import android.os.Parcelable;

public class Shop implements Parcelable{
	
	private String name;
	private String type;
	private String money;
	private String zhicheng;
	
	public Shop(){
		
	}
	
	public Shop(String name,String type,String money,String zhicheng){
		this.name = name;
		this.type = type;
		this.money = money;
		this.zhicheng = zhicheng;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getZhicheng() {
		return zhicheng;
	}

	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}
	
	@Override
	public int describeContents() {
		return 0;
	}
	@Override
	public void writeToParcel(Parcel parcel, int flag) {
		parcel.writeString(name);
		parcel.writeString(type);
		parcel.writeString(money);
		parcel.writeString(zhicheng);
	}
	
	public static final Parcelable.Creator<Shop> CREATOR = new Parcelable.Creator<Shop>(){

		@Override
		public Shop createFromParcel(Parcel parcel) {
			return new Shop(parcel.readString(),parcel.readString(),parcel.readString(),parcel.readString());
		}

		@Override
		public Shop[] newArray(int size) {
			return new Shop[size];
		}
	};
	
}
