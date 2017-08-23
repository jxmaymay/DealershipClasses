
public class Motorcycle extends Vehicle {
	int seats;
	
	public Motorcycle(String m, String mod, double p, int hP, int y, int s) {
		super(m, mod, p, hP, y);
		
		seats = s;
	}
	
	public int getNumSeats() {
		return seats;
	}

	public void setNumSeats(int seat) {
		seats = seat;
	}
}
