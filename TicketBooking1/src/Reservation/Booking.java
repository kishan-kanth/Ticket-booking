package Reservation;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
	String name;
	int BusNo;
	Date date;
	Booking(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		name= sc.next();
		System.out.println("enter bus number");
		BusNo= sc.nextInt();
		System.out.println("enter date of travelling DD-MM-YYYY");
		String ip = sc.next();
		SimpleDateFormat ip2 = new SimpleDateFormat ("DD-MM-YYYY");
		try {
			date =ip2.parse(ip);
		}
		catch(ParseException e) {
			e.printStackTrace();
			
		}
		
	}
	public boolean isavailable(ArrayList<Bus>Buses,ArrayList<Booking>Bookings) {
		int capacity = 0;
		for(Bus b: Buses) {
			if(b.getbno()==BusNo) {
				capacity = b.getcap(); 
				
			}
			
		}
		int booked = 0;
		for( Booking b:Bookings)
		{
			if(b.BusNo==BusNo && b.date.equals(date) )
				booked++;
		}
		 return booked<capacity ? true:false;
	}

}