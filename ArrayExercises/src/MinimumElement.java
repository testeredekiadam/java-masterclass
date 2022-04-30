import java.util.Scanner;

public class MinimumElement {
	public static void main(String[] args) {
		int[] array;
		Scanner count = new Scanner(System.in);
		System.out.println("Enter the array length:");
		int len = count.nextInt() - 1;
		System.out.println();
		System.out.println("Enter the array: ");
		array = readInteger(len);
		System.out.println("\nMinimum element of array = "+findMin(array));
		count.close();
	}
	
	public static int[] readInteger(int count) {
		int[] array = new int[count];
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the 1. element: ");
		int val = keyboard.nextInt();
		int i = 0;
		while(i < count) {
			array[i] = val;
			
			i++;
			System.out.println("Enter the " +(i+1)+". element: ");
			val = keyboard.nextInt();
		}
		keyboard.close();
		return array;
	}
	
	public static int findMin(int[] array) {
		int min = array[0];
		for(int i = 1; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}
	
}
