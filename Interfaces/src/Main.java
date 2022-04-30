
public class Main {
	public static void main(String[] args) {
		ITelephone firatPhone;
		firatPhone = new DeskPhone(123456);
		firatPhone.powerOn();
		firatPhone.callPhone(123456);
		firatPhone.answer();
		
		System.out.println();
		
		firatPhone = new MobilePhone(2);
		firatPhone.powerOn();
		firatPhone.callPhone(2);
		firatPhone.answer();
	}
}
