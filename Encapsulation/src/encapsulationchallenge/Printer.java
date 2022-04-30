package encapsulationchallenge;

public class Printer {
	private int toner_level = 100;
	private int printed_pages_number = 0;
	private boolean duplex_printer;
	
	public Printer(int toner_level, int printed_pages_number, boolean duplex_printer) {
		if(toner_level > 0 && toner_level <= 100) {
			this.toner_level = toner_level;
			}
		
		if(printed_pages_number > 0) {
			this.printed_pages_number = printed_pages_number;
		}
		
		this.duplex_printer = duplex_printer;
	}

	public int getToner_level() {
		return toner_level;
	}

	public int getPrinted_pages_number() {
		return printed_pages_number;
	}

	public boolean isDuplex_printer() {
		return duplex_printer;
	}
	
	public void fill_toner(int fill) {
		this.toner_level = this.toner_level + fill;
		if(this.toner_level > 100) {
			this.toner_level = 100;
		}
		System.out.println("\nToner level = " + this.toner_level);
	}
	
	public void duplex_mode(boolean mode) {
		this.duplex_printer = mode;
		System.out.println("\nMode is switched to " + this.duplex_printer);
	}
	
	public void printing_page(int page_amount) {
		int used_ink = (int)Math.round(page_amount * 0.1);
		if(duplex_printer) {
			page_amount *= 2;
			used_ink *= 2;
		}
		this.printed_pages_number += page_amount;
		this.toner_level -= used_ink;
		if(this.toner_level > 0) {
			System.out.println(page_amount + " pages are being printed...");
			get_printer_info();
		}
		else {
			System.out.println("Control the toner!");
		}
	}
	
	public void run_printer() {
		System.out.println("Printer is on.");
		get_printer_info();
	}
	
	public void get_printer_info() {
		System.out.println("\nToner lever = " + getToner_level() + "\nPrinted pages = " + getPrinted_pages_number());
	}
}
