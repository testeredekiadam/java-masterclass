import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		int[] array = getIntegers(5);
		int[] sorted = sortArray(array);
		printArray(sorted);
	}
	
	public static int[] getIntegers(int capacity) {
		int[] array = new int[capacity];
		System.out.println("Enter " + capacity +" integer: \r");
		for(int i = 0; i < capacity; i++) {
			System.out.println("Enter the " + (i+1)+". integer: ");
			array[i] = keyboard.nextInt();
		}
		return array;
	}
	
	public static int[] sortArray(int[] array) {
		int[] sortedArray = Arrays.copyOf(array, array.length);
		
		
		boolean flag = true;
		int temp;
		
		while(flag) {
			flag = false;
			for(int i = 0; i< sortedArray.length-1; i++) {
				if(sortedArray[i] > sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag = true;
				}
			}
		}
		return sortedArray;
	}
	
	
	public static void printArray(int[] array) {
		String val = "";
		for(int i = 0; i < array.length; i++) {
			val += Integer.toString(array[i]) + " ";
		}
		System.out.println(val);
	}
}
