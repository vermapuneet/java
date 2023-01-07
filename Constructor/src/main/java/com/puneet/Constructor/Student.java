package com.puneet.Constructor;

public class Student {
private String stid;
private String stname;
private String address;
public String getStid() {
	return stid;
}
public void setStid(String stid) {
	this.stid = stid;
}
public String getStname() {
	return stname;
}
public void setStname(String stname) {
	this.stname = stname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [stid=" + stid + ", stname=" + stname + ", address=" + address + "]";
}


}
