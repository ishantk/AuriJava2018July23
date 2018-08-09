package com.auribises.model;

public class Address {

	String adrsLine;
	String city;
	String state;
	int zipCode;
	
	public Address(){
		adrsLine = "NA";
		city = "Ludhiana";
		state = "Punjab";
		zipCode = 141002; 
	}
	
	public Address(String al, String c, String s, int z){
		adrsLine = al;
		city = c;
		state = s;
		zipCode = z;
	}
	
	public void setAddress(String al, String c, String s, int z){
		adrsLine = al;
		city = c;
		state = s;
		zipCode = z;
	}
	
	public void showAddress(){
		System.out.println("==Address Details==");
		System.out.println(adrsLine+"\n"+city+" - "+state+" - "+zipCode);
	}
}
