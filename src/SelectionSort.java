public class SelectionSort {
	public static void main(String[] args) {
		int toBeSortedArray[]=new int[] {34,6,2,89,1,4,58,23,5,54,7,99,3,76,9};
		isSelectionSorted(toBeSortedArray);
		for (int i = 0; i < toBeSortedArray.length; i++) {
			System.out.println(toBeSortedArray[i]+" ");
		}	
	}
	public static void isSelectionSorted(int arrayToBeSorted[]) {
		int currentIndex=0;
		for(currentIndex=0;currentIndex<arrayToBeSorted.length;currentIndex++) {
			/*System.out.println("\n"+currentArrayValue+"\n");*/
			for(int comparingIndex=0;comparingIndex<arrayToBeSorted.length;comparingIndex++) {
				int tempValue=0;
				if(arrayToBeSorted[currentIndex]<arrayToBeSorted[comparingIndex]) {
					tempValue=arrayToBeSorted[currentIndex];
					arrayToBeSorted[currentIndex]=arrayToBeSorted[comparingIndex];
					arrayToBeSorted[comparingIndex]=tempValue;
					/*System.out.println("\n Current Index "+tempValue+"\n Comparing Index"+arrayToBeSorted[comparingIndex]+"\n");*/
				}
			}
		}
	}
}