/**Test the uses of class inheritance. 
 * @author Mason Jenkins
 */

public class DealershipTester {
	public static void main(String[] args) {
		Car car1 = new Car("BMW", "335i", 35000.95, 300, 2017, 4);
		Car car2 = new Car("Mercedes-Benz", "E400", 55170.65, 520, 2016, 4);
		Motorcycle cycle1 = new Motorcycle("Ducati", "Multistrada", 15725.90, 150, 2012, 1);
		Motorcycle cycle2 = new Motorcycle("BMW", "S1000RR", 18725.90, 185, 2015, 2);
		
		cycle2.getBasicInfo();
		System.out.println("Seats: " + cycle2.getNumSeats());
		System.out.println("");
		System.out.println("There was an error, the bike only has one seat. Let's change that.");
		System.out.println("");
		cycle2.setNumSeats(1);
		//edit how many seats the database says it has.
		cycle2.getBasicInfo();
		System.out.println("Seats: " + cycle2.getNumSeats());
		System.out.println("");
		
		//now display info for the car
		car2.getBasicInfo();
		System.out.println("Doors: " +car2.getNumDoors() );
		System.out.println("");
		System.out.println("Edit the number of doors and the price.");
		car2.setNumDoors(2); //now it's a coupe!
		car2.setPrice(car2.getPrice() + 1500.00);
		System.out.println("");
		car2.getBasicInfo();
		System.out.println("Doors: " +car2.getNumDoors() );
	}
}
