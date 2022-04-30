
interface Executable {
	int execute(int a);
}

class Runner {
	public void run(Executable e) {
		System.out.println("Executing code block...");
		int value = e.execute(12);
		System.out.println("Return value is: " + value);
	}
}


public class App {

	public static void main(String[] args) {
		
		Runner runner = new Runner();
		runner.run(new Executable() {

			@Override
			public int execute(int a) {
				System.out.println("Hello there.");
				return 7 + a;
				
			}
			
		});
		
		System.out.println("===================");
		
		runner.run(a -> {
			System.out.println("This is code passed in a lambda expression.");
			System.out.println("Hello there.");
			return 8+a;
		});
		
		System.out.println("====================");
		
		runner.run(a -> 8+a);
		
	}
}
