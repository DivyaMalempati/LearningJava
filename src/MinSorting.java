
public class MinSorting {
	public static void main(String[] args) {
		int[] array= new int[] {2,56,4,71,3,10,9,63,92,16,7,48,54,72,8,60};
		int currentIndex=0;
		searchMinValue(currentIndex,array);
		printArray(array);
	}

	private static void printArray(int[] array) {
		for (int i : array) {
			System.out.println(i);
		}
	}

	private static void searchMinValue(int currentIndex, int[] array) {
			for(;currentIndex<array.length;currentIndex++) {
				int findMinIndex=currentIndex;
				for (; findMinIndex < array.length-1; findMinIndex++) {
					if(array[currentIndex]>array[findMinIndex]) {
						swapValues(array,currentIndex,findMinIndex);
					}
				}
			}
				
	}

	private static void swapValues(int[] array, int currentIndex, int findMinIndex) {
		int tempValue=0;
		tempValue=array[currentIndex];
		array[currentIndex]=array[findMinIndex];
		array[findMinIndex]=tempValue;
	}

}