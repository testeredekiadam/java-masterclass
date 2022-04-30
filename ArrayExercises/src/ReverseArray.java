import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		System.out.println("Array: " + Arrays.toString(array));
		reverse(array);

	}
	
	public static void reverse(int[] array) {
		int[] reversedArray = new int[array.length];
		int j = 0;
		for(int i = array.length-1 ; i >= 0; i-- ) {
			reversedArray[j] = array[i];
			j++;
		}
		System.out.println("Reversed Array: "+Arrays.toString(reversedArray));
	}
}
