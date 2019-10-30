package wmad202;

public class SelectionSort {

	public static void main(String[] args) {
		int [] numbers = {4,7,2,5,1,8,0,6,3,9};
		printArray(numbers);
		sort(numbers);
		printArray(numbers);
	}
	
	private static void sort(int[] numbers) {
		for(int i = 0; i <= numbers.length; i++) {
			int index = i;
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[j] < numbers[index]) index = j;
			}
			if ( i != index) {
				int temp = numbers[index];
				numbers[index] = numbers[i];
				numbers[i] = temp;
			}
		}
	}
	private static void printArray(int [] numbers) {
		for(int i: numbers) System.out.print(i + " ");
		System.out.println();
	}
}
