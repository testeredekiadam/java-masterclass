import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		System.out.println("Reading objects...");
		
		try(ObjectInputStream os = new ObjectInputStream(new FileInputStream("test.ser"))){
			
			Person person1 = (Person)os.readObject();
			Person person2 = (Person)os.readObject();
					
			System.out.println(person1);
			System.out.println(person2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
