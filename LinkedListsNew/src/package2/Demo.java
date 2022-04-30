package package2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<String>();
		
		addInOrder(placesToVisit, "Mercury");
		addInOrder(placesToVisit, "Venus");
		addInOrder(placesToVisit, "Earth");
		addInOrder(placesToVisit, "Mars");
		addInOrder(placesToVisit, "Jupiter");
		addInOrder(placesToVisit, "Saturn");
		addInOrder(placesToVisit, "Uranus");
		addInOrder(placesToVisit, "Neptune");
		addInOrder(placesToVisit, "Pluto");
		
		printList(placesToVisit);
		
		System.out.println("");
		addInOrder(placesToVisit, "2 Draconis b");
		addInOrder(placesToVisit, "Jupiter");
		System.out.println("");
		printList(placesToVisit);
		
		System.out.println("");
		visit(placesToVisit);
	}
	
	
	private static void printList(LinkedList<String> list) {
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			System.out.println("Now visiting " + i.next());
		}
		System.out.println("=======================");
	}
	
	private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		ListIterator<String> stringListIterator = linkedList.listIterator();
		
		while(stringListIterator.hasNext()) {
			int comparison = stringListIterator.next().compareTo(newCity);
			if(comparison == 0) {
				//equal, do not add
				System.out.println(newCity + " is already included as a destination");
				return false;
			} else if(comparison > 0) {
				// new City should appear before this one
				// Serefli Kochisar -> Haymana
				
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			} else if(comparison < 0) {
				//move on next city
				
			}
		}
		
		
		stringListIterator.add(newCity);
		return true;
	}
	
	private static void visit(LinkedList cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		ListIterator<String> listIterator = cities.listIterator();
		
		if(cities.isEmpty()) {
			System.out.println("No cities in the itenerary");
		} else {
			System.out.println("Now visiting " + listIterator.next());
			printMenu();
		}
		
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action) {
				case 0:
					System.out.println("Holiday (Vacation) over");
					quit = true;
					break;
				
				case 1:
					if(listIterator.hasNext()) {
						System.out.println("Now visiting " + listIterator.next());
					} else {
						System.out.println("Reached the end of the list");
					}
					break;
				
				case 2:
					if(listIterator.hasPrevious()) {
						System.out.println("Now visiting: " + listIterator.previous());
					}else {
						System.out.println("We are at the start of the list");
					}
					break;
				
				case 3:
					printMenu();
					break;
			}
		}
	}
	
	private static void printMenu() {
		System.out.println("Available actions:\npress ");
		System.out.println("0 - to quit\n" + 
					"1 - go to next city\n" + 
					"2 - go to previous city\n" +
					"3 - print menu options");
	}
}
