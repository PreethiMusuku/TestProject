package com.capgemini.dao;

import java.util.HashMap;
import java.util.Map;
import com.capgemini.entity.Flight;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class FlightDaoImpl implements Dao {
	 private ArrayList<Flight> accountEntry;
	 private Map<Integer, Flight> flightEntry;
	 static List<Flight> flights;
	 protected List<Flight> getAccountEntry1() {
	        return flights;
	    }
	 protected Map<Integer, Flight> getAccountEntry() {
	        return flightEntry;
	    }
	    public FlightDaoImpl() {
	    	//Searching flights//
	        flights = new ArrayList<Flight>();
	        Flight fromloc = new Flight("hyd","delhi",110,78,"spicejet");
	        flights.add(fromloc);
	        
	    }
	    public List<Flight> searchFlightDetails(String fromloc, String toloc ) {
			if(fromloc.equals(fromloc)&&toloc.equals(toloc))
			 {
				 System.out.println("flights found:");
			 
			return getAccountEntry1();
			 }
			 else
			 {
				 System.out.println("no flights found");
			 }
		     return null;
		  } 
	 
		
		//registration//
	 public ArrayList<Flight> userRegistration(String type1, String uname1, int uid1, String pass1, long phn1, String mail1) { 
			Flight bean =new Flight();
		    		
		    		bean.setEmail(mail1);
		    		bean.setUserName(uname1);
		    		bean.setUserType(type1);
		    		bean.setUserPassword(pass1);
		    		bean.setUserId(uid1);
		    		bean.setUserPhonenumber(phn1);
		    		
		    		return accountEntry;
		    	}
	@Override
	public List<Flight> searchFlightDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	    
	 }
	


        
      		
    

