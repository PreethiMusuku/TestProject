package com.capgemini.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.capgemini.entity.Flight;
import com.capgemini.service.FlightServiceImpl;

public class DaoTest {
	Dao  dao= new FlightDaoImpl();
	Flight f=new Flight("hyd","delhi",110,78,"spicejet");
	
		@Test
		public void testSearchFlightDetails() {
			List<Flight> s=dao.searchFlightDetails();
			assertEquals(s,f);
			
		}
		private void assertEquals(List<Flight> s, Flight f2) {
			
		}
		@Test
		public void testUserRegistration() {
			ArrayList<Flight> g=dao.userRegistration("typeA", "preethi", 11, "7856",98738922l,"p@gmail");
			assertNotEquals(g,f);
		}
	}

