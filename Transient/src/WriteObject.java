import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	
	public static void main(String[] args) {
		
		System.out.println("Writing object...");
		
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"))){
			
			Person person1 = new Person(7, "Bob");
			Person person2 = new Person(8, "Alice");
			Person.setCount(88);
			os.writeObject(person1);
			os.writeObject(person2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
