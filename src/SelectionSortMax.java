import java.util.Scanner;

public class SelectionSortMax {
	public static void main(String[] args) {
		int arrayToSort[]= new int[] {100,5,9,3,83,17,1,94};
		maxSelectionSort(arrayToSort);
		for (int i=0;i<arrayToSort.length;i++) {
			System.out.println(arrayToSort[i]);
		}
	}
	public static void maxSelectionSort(int arrayToBeSorted[]) {
		int lastIndex=arrayToBeSorted.length-1;
		for(;lastIndex>0;lastIndex--) {
			int currentComparingIndex=arrayToBeSorted[lastIndex];
			for(currentComparingIndex=lastIndex;currentComparingIndex>=0;currentComparingIndex--) {
				if(arrayToBeSorted[lastIndex]<=arrayToBeSorted[currentComparingIndex]) {
					int tempValue=0;
					tempValue=arrayToBeSorted[lastIndex];
					arrayToBeSorted[lastIndex]=arrayToBeSorted[currentComparingIndex];
					arrayToBeSorted[currentComparingIndex]=tempValue;
				}
			}	
		}
	}
}