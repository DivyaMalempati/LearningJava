import java.util.Scanner;

public class Collection {
	public static void main(String[] args) {
		int arrayInitialSize = 2, index = 0;
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[arrayInitialSize];
		array = insertIntoArray(scanner, array);
		printArray(array);
		// System.out.println(array.length);
		System.out.println("Enter the Index to be deleted");
		index = scanner.nextInt();
		deletefromArray(array, index);
		printArray(array);
		scanner.close();
	}

	private static void deletefromArray(int[] array, int index) {
		System.out.println(array[index]);
		if (index < array.length) {
			for (int i = index; (i < array.length - 1); i++) {
				array[i] = array[i + 1];
			}
			array[array.length - 1] = 0;
		}
	}

	private static int[] insertIntoArray(Scanner scanner, int[] array) {
		int number;
		int arrayIndex = 0;
		do {
			number = scanner.nextInt();
			if (number != -1) {
				if (arrayIndex > array.length - 1) {
					array = increaseArraySize(array);
					System.out.println("After Increasing Array Size" + array.length);
				}
				array[arrayIndex] = number;
				arrayIndex++;
			} else {
				break;
			}
		} while (true);
		return array;
	}

	private static int[] increaseArraySize(int[] array) {
		int arraySize = array.length * 2;
		int[] newArray = new int[arraySize];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		return newArray;

	}

	private static void printArray(int[] array) {
		for (int arrayValue : array) {
			System.out.println(arrayValue);
		}

	}
}
