package com.capgemini.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.capgemini.dao.FlightDaoImpl;
import com.capgemini.entity.Flight;


public class FlightServiceImpl implements FlightService {
    static FlightDaoImpl dao=new FlightDaoImpl();
	
	@Override
	public List<Flight> searchFlightDetails() {
		// TODO Auto-generated method stub
		return dao.searchFlightDetails();
	}
	@Override
	public ArrayList<Flight> userRegistration(String type1, String uname1, int uid1, String pass1, long phn1,
			String mail1) {
		// TODO Auto-generated method stub
		return dao.userRegistration(type1, uname1, uid1, pass1, phn1, mail1);
	}

}

