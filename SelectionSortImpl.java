// Assuming that We are writing program to implement Selection sort on a set of 10 elements

package assignment_5;

import java.util.Scanner;
/*Application which creates an unsorted array and passes it to a selection sort method for sorting*/

public class SelectionSortImpl {
	public static void main(String[] args) {
		int[] array = new int[10];
		array = readArray(array);
		array = selectionSort(array);
		System.out.println("\nArray after sorting: ");
		display(array);
	}

	// Method to read inputs from user
	static int[] readArray(int[] array) {
		System.out.println("Array before sorting: ");
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 10; i++)
			array[i] = s.nextInt();
		s.close();
		return array;

	}

	// Method implementing Selection_sort
	static int[] selectionSort(int[] element) {
		for (int i = 1; i < 10; i++)
			for (int j = i + 1; j < 10; j++)
				// Swapping logic
				if (element[j] < element[i]) {
					int temp = element[i];
					element[i] = element[j];
					element[j] = temp;
				}
		return element;
	}

	// Method to display array elements
	static void display(int[] element) {
		for (int t : element)
			System.out.print(t + " ");
	}

}
