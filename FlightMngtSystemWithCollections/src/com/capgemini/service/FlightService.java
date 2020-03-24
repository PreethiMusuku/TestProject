package com.capgemini.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.capgemini.entity.Flight;


public interface FlightService {
	

	ArrayList<Flight> userRegistration(String type1, String uname1, int uid1, String pass1, long phn1, String mail1);

	List<Flight> searchFlightDetails();




}



