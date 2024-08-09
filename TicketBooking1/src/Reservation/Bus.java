package Reservation;

public class Bus {
	private int BusNo;
	private Boolean Ac;
	private int Capacity;
	Bus(int bno, boolean ac, int cap){
	this.BusNo=bno;
	this.Ac=ac;
	this.Capacity=cap;
}
	public int getbno()
	{
		return BusNo;
	}
	public int getcap() {
		return Capacity;
	}
	public boolean getac() {
		return Ac;
	}
	public void setac(boolean val) {
		Ac=val;
	}
	public void setcap(int cap) {
		Capacity = cap;
	}
	public void display() {
		System.out.println("BusNo "+ BusNo +"\n"+"Ac "+Ac+ "\n"+"CApacity" + Capacity);
	}
}