/**Vehicle class for hypothetical
 * car dealership management system.
 * @author Mason Jenkins
 */

public class Vehicle {
	private String make;
	private double price;
	private String model;
	private int horsepower;
	private int year;
	
	public Vehicle(String m, String mod, double p, int hP, int y) {
		make = m;
		model = mod;
		price = p;
		horsepower = hP;
		year = y;
	}
	
	public String getManufacturer() {
		return make;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double pric) {
		price = pric;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getHorsepower() {
		return horsepower;
	}
	
	public int getYear() {
		return year;
	}
	
	public void getBasicInfo() {
		System.out.println("Manufacturer: " + make);
		System.out.println("Model: " + model + ", " + year);
		System.out.println("HP: " + horsepower);
		System.out.println("Price: $" + price);
	}
}
