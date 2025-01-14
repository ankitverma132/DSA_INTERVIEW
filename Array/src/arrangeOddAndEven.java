//Given an array of size n containing equal number of odd and even numbers.
//Arrange even numbers at even index and odd numbers at odd index
public class arrangeOddAndEven {

	//O(n) time complexity
	// function to arrange odd and even numbers
	public static void arrangeOddAndEven(int arr[], int n) {
		int oddInd = 1;
		int evenInd = 0;
		while (true) {
			while (evenInd < n && arr[evenInd] % 2 == 0)
				evenInd += 2;

			while (oddInd < n && arr[oddInd] % 2 == 1)
				oddInd += 2;

			if (evenInd < n && oddInd < n) {
				//swap
				int temp = arr[evenInd];
				arr[evenInd] = arr[oddInd];
				arr[oddInd] = temp;
			}else {
				break;
			}
		}
	}

	// function to print the array
	public static void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	// Driver function
	public static void main(String argc[]) {
		int arr[] = { 3, 6, 12, 1, 5, 8 };
		int n = 6;

		arrangeOddAndEven(arr, n);

		System.out.print("\nModified Array: ");
		printArray(arr, n);
	}
}