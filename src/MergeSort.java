
public class MergeSort {
	public static void main(String[] args) {
		int[] arrayToBeSorted= new int[]{23,54,73,81,7,5};
		int initialIndex=0,lastIndex=arrayToBeSorted.length;
		System.out.println(initialIndex+" "+lastIndex);
		mergeSort(initialIndex, lastIndex, arrayToBeSorted);
		for (int i=0; i<arrayToBeSorted.length;i++) {
			System.out.println(arrayToBeSorted[i]);
		}
		
	}
	public static void mergeSort(int initialIndex,int lastIndex,int[] arrayToBeSorted) {
		int middleIndex=0;
		if(initialIndex<lastIndex)
			middleIndex = initialIndex+(lastIndex-1)/2;
			System.out.println("Whole Array Initial Index is "+initialIndex+" Middle Index is "+middleIndex+" Last index is "+lastIndex);
			mergeSort(initialIndex,middleIndex, arrayToBeSorted);
			System.out.println("First Half Initial Index is "+initialIndex+" Middle Index is "+middleIndex+" Last index is "+lastIndex);
			mergeSort(middleIndex+1, lastIndex, arrayToBeSorted);
			System.out.println("Second Half Initial Index is "+initialIndex+" Middle Index is "+middleIndex+" Last index is "+lastIndex);
			merge(initialIndex,middleIndex,lastIndex,arrayToBeSorted);
	}
	private static void merge(int initialIndex, int middleIndex, int lastIndex, int[] arrayToBeSorted) {
		
		
	}
}
