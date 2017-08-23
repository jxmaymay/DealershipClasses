/** Car subclass of vehicle.
 * @author Mason Jenkins
 */

public class Car extends Vehicle {
	private int numDoors;
	
	public Car(String m, String mod, double p, int hP, int y, int nD) {
		super(m, mod, p, hP, y);
		
		numDoors = nD;
	}
	
	public int getNumDoors() {
		return numDoors;
	}
	
	public void setNumDoors(int numDoor) {
		numDoors = numDoor;
	}
}
