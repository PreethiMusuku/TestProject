package com.capgemini.entity;

import java.util.Iterator;

public class Flight {
	String userType;
	String userName;
	int userId;
    String userPassword;
	long userPhonenumber;
	String Email;


	public String toString1() {
		return "Flight [userType=" + userType + ", userName=" + userName + ", userId=" + userId + ", userPassword="
				+ userPassword + ", userPhonenumber=" + userPhonenumber + ", Email=" + Email + "]";
	}

	public Flight(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}

	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public long getUserPhonenumber() {
		return userPhonenumber;
	}
	public void setUserPhonenumber(long userPhonenumber) {
		this.userPhonenumber = userPhonenumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Flight(String userType, String userName, int userId, String userPassword, long userPhonenumber, String email) {
		super();
		this.userType = userType;
		this.userName = userName;
		this.userId = userId;
		this.userPassword = userPassword;
		this.userPhonenumber = userPhonenumber;
		Email = email;
	}
	public Flight(){
		
	}
	
	String fromloc;
	String toloc;
	int noOfSeats;
	int flightId;
	String flightName;
	public String getFromloc() {
		return fromloc;
	}
	public void setFromloc(String fromloc) {
		this.fromloc = fromloc;
	}
	public String getToloc() {
		return toloc;
	}
	public void setToloc(String toloc) {
		this.toloc = toloc;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public Flight(String fromloc, String toloc, int noOfSeats, int flightId, String flightName) {
		super();
		this.fromloc = fromloc;
		this.toloc = toloc;
		this.noOfSeats = noOfSeats;
		this.flightId = flightId;
		this.flightName = flightName;
	}

	public Iterator<Flight> iterator() {
		
		return null;
	}
	
	
	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String FlightDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "Flight [fromloc=" + fromloc + ", toloc=" + toloc + ", noOfSeats=" + noOfSeats + ", flightId=" + flightId
				+ ", flightName=" + flightName + "]";
	}
	}
	