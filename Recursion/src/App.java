
public class App {
	public static void main(String[] args) {
		
		
		System.out.println(factorial(4));
		
	}
	
	private static int factorial(int value) {
		
		
		if(value == 1) 	return 1;
		
		
		return factorial(value-1)*value;
	}
}
