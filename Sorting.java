/* 	
 * Wenrui Li
 * Comp 157 - Exercise3
 * 02/16/2018
 * Selection Sort and Bubble Sort
*/
import java.util.Arrays;

public class Sorting {
	// This is the array that need to sort.They have the same values but different
	// orders.
	// You may change the values in the array.
	// Array Size:10
	private final static int[] array1 = new int[] { 10, 30, 36, 51, 23, 7, 98, 83, 28, 39 };
	private final static int[] array2 = new int[] { 83, 7, 98, 39, 10, 30, 28, 23, 36, 51 };

	public static void main(String[] args) {

		// Selection Sort with print out
		System.out.print("Before Selection Sort: ");
		System.out.println(Arrays.toString(array1));
		SelectionSort(array1);
		System.out.print("Selection Sort Result: ");
		System.out.println(Arrays.toString(array1));

		// Bubble Sort with print out
		System.out.print("Before Bubble Sort: ");
		System.out.println(Arrays.toString(array2));
		BubbleSort(array2);
		System.out.print("Bubble Sort Result: ");
		System.out.println(Arrays.toString(array2));
	}

	public static void BubbleSort(int[] input) {
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = 0; j < input.length - i - 1; j++) {
				if (input[j] > input[j + 1]) {
					int swap = input[j];
					input[j] = input[j + 1];
					input[j + 1] = swap;
				}
			}
		}
	}

	public static void SelectionSort(int[] input) {
		for (int i = 0; i < input.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < input.length; j++) {
				if (input[index] > input[j]) {
					index = j;
				}
			}
			int small = input[index];
			input[index] = input[i];
			input[i] = small;
		}
	}
}
