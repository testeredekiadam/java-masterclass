class Car {
	private boolean engine;
	private int cylinders;
	private int wheels;
	private String name;
	
	public Car(int cylinders, String name) {
		this.engine = true;
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = 4;
	}
	
	public int getCylinders() {
		return cylinders;
	}
	
	public String getName() {
		return name;
	}
	
	public String startEngine() {
		return "Car -> startEngine()";
	}
	
	public String accelerate() {
		return "Car -> accelerate()";
	}
	
	public String brake() {
		return "Car -> brake()";
	}
}

class Mitsubishi extends Car{
	
	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " -> startEngine()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " -> accelerate()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " -> brake()";
	}
}


class Chevrolet extends Car {
	
	public Chevrolet(int cylinder, String name) {
		super(cylinder, name);
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " -> startEngine()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " -> accelerate()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " -> brake()";
	}
}


class Dodge extends Car {

	public Dodge(int cylinders, String name) {
		super(cylinders, name);
	}

	
	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " -> startEngine()";
	}


	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " -> accelerate()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " -> brake()";
	}
	
}

public class Main {
	public static void main(String[] args) {
		int i = (int)(Math.round(Math.random()*2 + 1));
		
		Car car;
		
		if(i == 2) {
			car = new Dodge(6, "Charger");
			System.out.println(car.startEngine());
			System.out.println(car.accelerate());
			System.out.println(car.brake());
		}else if(i == 1) {
			car = new Chevrolet(4, "Camaro");
			System.out.println(car.startEngine());
			System.out.println(car.accelerate());
			System.out.println(car.brake());
		}else{
			car = new Mitsubishi(2, "Lancer EVO");
			System.out.println(car.startEngine());
			System.out.println(car.accelerate());
			System.out.println(car.brake());
		}
	}
}
