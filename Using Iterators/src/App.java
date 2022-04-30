import java.util.Iterator;
import java.util.LinkedList;

public class App {
	
	public static void main(String[] args) {
		
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");
		
		
		Iterator<String> it = animals.iterator();
		
		while(it.hasNext()) {
			String animal = it.next();
			System.out.println(animal);
			
			if(animal.equals("cat")){
				it.remove();
			}
		}
		

		
		System.out.println();
		
		//Modern iteration, Java 5 and later
		
		for(String animal1 : animals) {
			System.out.println(animal1);
		}
		
	}

}
