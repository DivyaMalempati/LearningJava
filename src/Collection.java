import java.util.Scanner;

public class Collection {
	public static void main(String[] args) {
		int arrayInitialSize=2,number=0;
		Scanner scanner= new Scanner(System.in);
		int[] array= new int[arrayInitialSize];
		int arrayIndex=0;
		do {
			number=scanner.nextInt();
			if(number!=-1) {
				if(arrayIndex>array.length-1) {
					array=increaseArraySize(array);
					System.out.println("After Increasing Array Size"+array.length);			
				}
				array[arrayIndex]=number;
				arrayIndex++;
			}
			else {
				break;
			}
		} while (true);
		printArray(array);
		scanner.close();
	}

	private static int[] increaseArraySize(int[] array) {
		int arraySize=array.length*2;
		int[] newArray=new int[arraySize];
		for (int i = 0; i < array.length; i++) {
			newArray[i]=array[i];
		}
		return newArray;
		
	}

	private static void printArray(int[] array) {
		for (int arrayValue : array) {
			System.out.println(arrayValue);
		}
		
	}
}
