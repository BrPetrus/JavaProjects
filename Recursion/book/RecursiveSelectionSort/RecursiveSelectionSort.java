package book.RecursiveSelectionSort;

public class RecursiveSelectionSort {
	public static void main(String[] args) {
		int[] array = { 5, 6, 9, 7, 3, 2, 1 };
		display(array);
		sort(array);
		display(array);
	}
	
	public static void sort(int[] array) { //Recursive helper method
		sort(array, 0, array.length - 1);
	}
	private static void sort(int[] array, int sIndex, int eIndex) {
		if (sIndex < eIndex) {
			//Find the lowest number
			int lowestNumberIndex = sIndex;
			for (int i = sIndex; i <= eIndex; i++) {
				if (array[lowestNumberIndex] > array[i])
					lowestNumberIndex = i;
			}
			
			//Place lowest number at first place
			int tmp = array[sIndex];
			array[sIndex] = array[lowestNumberIndex];
			array[lowestNumberIndex] = tmp;
			
			//Sort the rest
			sort(array, sIndex+1, eIndex);
		}
	}
	
	public static void display(int[] a) {
		for (int i = 0; i < a.length; i++) 
			System.out.print(a[i] + " ");
		System.out.println();
	}
}
