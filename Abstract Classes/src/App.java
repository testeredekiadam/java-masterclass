
public class App {
	
	public static void main (String[] args) {
		Camera cam1 = new Camera();
		cam1.setId(5);
		cam1.start();
		
		System.out.println(cam1.getId());
		
		Car car1 = new Car();
		car1.setId(4);
		car1.start();
		
		//Machine machine1 = new Machine();
	}
}
