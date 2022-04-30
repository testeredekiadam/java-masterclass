package encapsulationchallenge;

public class Main {
	public static void main(String[] args) {
		
		Printer printer = new Printer(50, 10, false);
		
		printer.run_printer();
		
		
		printer.printing_page(600);

	}

}
