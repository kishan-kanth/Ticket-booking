package Reservation;
import java.util.*;
public class Demo {
	public static void main(String[]args) {
		ArrayList<Bus> Buses =new ArrayList<Bus>();
		ArrayList<Booking> Bookings=new ArrayList<Booking>();
		Buses.add(new Bus(1,true,43));
		Buses.add(new Bus(2,false,30));
		Buses.add(new Bus(3,true,44));
		Buses.add(new Bus(4,false,45));
		for(Bus b:Buses) {
			b.display();
		}
		int ch=1;
		Scanner s=new Scanner(System.in);
		while(ch==1) {
			
			System.out.println("entre 1 to book and 2 to exit");
			
			ch=s.nextInt();
			if(ch==1) {
				Booking book = new Booking();
				if(book.isavailable(Buses,Bookings)) {
					System.out.println("your booking is confirmed");
					Bookings.add(book);
				}
				else {
					System.out.println("Sorry try for another Bus");
				}
			}
		}
		
	}

}