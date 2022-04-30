import java.util.Scanner;

class Hamburger{
	private String name;
	private String breadRoll;
	private String meat;
	private double price;
	
	private String addition1Name;
	private double addition1Price;

	private String addition2Name;
	private double addition2Price;

	private String addition3Name;
	private double addition3Price;

	private String addition4Name;
	private double addition4Price;

	
	public Hamburger(String breadRoll, String meat, double price, String name) {
		this.breadRoll = "normal";
		this.meat = meat;
		this.price = price;
		this.name = name;
	}
	

	public void addHamburgerAddition1(String name, double price) {
		this.addition1Name = name;
		this.addition1Price = price;
	}
	
	public void addHamburgerAddition2(String name, double price) {
		this.addition2Name = name;
		this.addition2Price = price;
	}
	
	public void addHamburgerAddition3(String name, double price) {
		this.addition3Name = name;
		this.addition3Price = price;
	}
	
	public void addHamburgerAddition4(String name, double price) {
		this.addition4Name = name;
		this.addition4Price = price;
	}
	
	public double itemizeHamburger() {
		double hamburgerPrice = this.price;
		System.out.println(this.name + " hamburger " + " on a "+ this.breadRoll + " roll " + " price is " + this.price);
		
		if(this.addition1Name != null) {
			hamburgerPrice += this.addition1Price;
			System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
		}
		
		if(this.addition2Name != null) {
			hamburgerPrice += this.addition2Price;
			System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
		}
		
		if(this.addition3Name != null) {
			hamburgerPrice += this.addition3Price;
			System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
		}
		
		if(this.addition4Name != null) {
			hamburgerPrice += this.addition4Price;
			System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
		}
		
		return hamburgerPrice;
	} 
	
	
}


class HealthyBurger extends Hamburger{

	private String healthyExtra1Name;
	private double healthyExtra1Price;
	
	private String healthyExtra2Name;
	private double healthyExtra2Price;
	
	public HealthyBurger(String meat, double price) {
		super("Brown ryw", meat, price, "Healthy");
	}
	
	public void addHealthyAddition1(String name, double price) {
		this.healthyExtra1Name = name;
		this.healthyExtra1Price = price;
	}
	
	public void addHealthyAddition2(String name, double price) {
		this.healthyExtra2Name = name;
		this.healthyExtra2Price = price;
	}
	
	@Override
	public double itemizeHamburger() {
		double hamburgerPrice = super.itemizeHamburger();
		if(this.healthyExtra1Name != null) {
			hamburgerPrice += this.healthyExtra1Price;
			System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
		}
		if(this.healthyExtra2Name != null) {
			hamburgerPrice += this.healthyExtra2Price;
			System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
		}
		return hamburgerPrice;
	}
	
}


class DeluxeBurger extends Hamburger{

	public DeluxeBurger() {
		super("White", "Sausage", 14.54, "Deluxe");
		super.addHamburgerAddition1("Chips", 2.75);
		super.addHamburgerAddition2("Drink", 1.81);
	}

	@Override
	public void addHamburgerAddition1(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Can not add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition2(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Can not add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition3(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Can not add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition4(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Can not add additional items to a deluxe burger");
	}
	
	
	
}


public class BillsBurger {

	public static void main(String[] args) {
		Hamburger hamburger = new Hamburger("White", "Sausage", 3.65, "Basic");
		hamburger.addHamburgerAddition1("Tomato", 0.27);
		hamburger.addHamburgerAddition2("Lettuce", 0.75);
		hamburger.addHamburgerAddition3("Cheese", 1.12);
		System.out.println("Total Burger price = " + hamburger.itemizeHamburger());
		
		System.out.println("");
		
		HealthyBurger hb = new HealthyBurger("bacon", 5.67);
		hb.addHealthyAddition1("Egg", 5.43);
		hb.addHamburgerAddition1("Lettuce", 0.25);
		hb.addHealthyAddition2("Chia seed", 1.05);
		System.out.println("Total Burger Price = " + hb.itemizeHamburger());
		
		System.out.println("");
		
		DeluxeBurger db = new DeluxeBurger();
		System.out.println("Total Price = " + db.itemizeHamburger());

	}
}
