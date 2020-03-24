package com.capgemini.ui;
import java.util.List;
import java.util.Scanner;


import com.capgemini.dao.FlightDaoImpl;
import com.capgemini.dao.InvalidUserException;
import com.capgemini.dao.InvalidnumberException;
import com.capgemini.entity.Flight;
import com.capgemini.service.FlightService;
import com.capgemini.service.FlightServiceImpl;

public class MainUi {
	
	private static FlightService accountService = new FlightServiceImpl();
    
    public static FlightService getAccountService() {
        return accountService;
    }
static FlightService service=new FlightServiceImpl();
static FlightDaoImpl service2=new FlightDaoImpl();

	public static void main(String[] args) throws InvalidnumberException{
		
	while(true)
	{
		System.out.println("FLIGHT MANAGEMENT SYSTEM");
		System.out.println("1.SignIn/register");
		System.out.println("2.search flights");
		System.out.println("3.Exit");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		switch(key){
		case 1:{
			
			System.out.println("REGISTRATION:");
			System.out.println("enter usertype");
			String type1=sc.next();
			System.out.println("enter userid");
			int uid1=sc.nextInt();
			System.out.println("enter username");
			String uname1=sc.next();
			System.out.println("enter password");
			String pass1=sc.next();	
			System.out.println("enter userphonenumber");
			long phn1=sc.nextLong();
			System.out.println("enter mailid");
			String mail1=sc.next();
          
            Flight f=new Flight(type1,uname1,uid1,pass1,phn1,mail1);
			 service.userRegistration(type1,uname1,uid1,pass1,phn1,mail1);
           System.out.println(f.toString1());
			break;
		}
		case 2:
			System.out.println("SEARCH FLIGHTS:");
			System.out.println("enter from location");
			String fromloc=sc.next();
			System.out.println("enter to location");
			String toloc=sc.next();
			FlightService service = getAccountService();
			List<Flight> account = service.searchFlightDetails();
			for (Flight detail : service2.searchFlightDetails(fromloc,toloc)) {
			        System.out.println(detail.toString());
			     }
			break;
	
		case 3:
			System.exit(key);
			System.out.println("THANK YOU");
		break;
		}
	}
	}
	}
