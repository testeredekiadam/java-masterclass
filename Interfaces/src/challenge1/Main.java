package challenge1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Player firat = new Player("firat", 10, 5);
		saveObject(firat);
		
		firat.setHitPoint(100);
		firat.setWeapon("Intelligence");
		System.out.println(firat);
		
		saveObject(firat);
		loadObjects(firat);
		System.out.println("");
		System.out.println(firat);
		
		System.out.println("");
		
		Monster shelob = new Monster("shelob", 200, 100);
		saveObject(shelob);
		loadObjects(shelob);
		System.out.println(shelob);
		
	}
	
	public static ArrayList<String> readValues(){
		ArrayList<String> values = new ArrayList<String>();
		
		Scanner keyboard = new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out.println("Choose\n"+
				"1 to enter a string\n" +
				"0 to quit");
		while(!quit) {
			System.out.println("Choose an option: ");
			int choice = keyboard.nextInt();
			keyboard.nextLine();
			switch(choice) {
				case 0:
					quit = true;
					break;
				case 1:
					System.out.println("Enter a new string: ");
					String stringInput = keyboard.nextLine();
					values.add(index, stringInput);
					index++;
					break;
			}
		}
		return values;
	}
	
	public static void saveObject(ISaveable objectToSave) {
		for(int i=0; i<objectToSave.write().size(); i++) {
			System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
		}
	}
	
	public static void loadObjects(ISaveable objectToLoad) {
		ArrayList<String> values = readValues();
		objectToLoad.read(values);
	}
}
