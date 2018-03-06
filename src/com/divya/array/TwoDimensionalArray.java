package com.divya.array;

public class TwoDimensionalArray {
	static int increment = 1;

	public static void main(String[] args) {
		int rowSize = 3, columnSize = 3;
		int[][] array = createMatrixInSequenceHorizontally(rowSize, columnSize);
		System.out.println("Horizontal Array Printing :");
		printArray(rowSize, columnSize, array);
		increment = 1;
		int[][] verticalArray = createMatrixInSequenceVertically(rowSize, columnSize);
		System.out.println("Vertical Array Printing :");
		printArray(rowSize, columnSize, verticalArray);
		int[][] hashArray = createMatrixDiagonally(rowSize, columnSize);
		System.out.println("Diagonal Array Printing :");
		printArray(rowSize, columnSize, hashArray);
		int[][] hashArrayDecrement = createMatrixDiagonallyDecrement(rowSize, columnSize);
		System.out.println("Diagonal Decrement Array Printing :");
		printArray(rowSize, columnSize, hashArrayDecrement);

	}

	private static int[][] createMatrixDiagonallyDecrement(int rowSize, int columnSize) {
		int[][] array = new int[rowSize][columnSize];
		for (int rowIndex = 0; rowIndex < rowSize; rowIndex++) {
			for (int columnIndex = 0; columnIndex < columnSize; columnIndex++) {
				int currentValue = rowIndex + columnIndex+1;
				if(rowIndex+columnIndex<columnSize) {
				array[rowIndex][columnIndex] = currentValue;
				}
				else if ((rowIndex+columnIndex)>=columnSize) {
					int totalSize = rowSize+columnSize;
					array[rowIndex][columnIndex] = totalSize-currentValue;
				}
			}
		}
		return array;
	}

	private static int[][] createMatrixDiagonally(int rowSize, int columnSize) {
		int[][] array = new int[rowSize][columnSize];
		for (int rowIndex = 0; rowIndex < rowSize; rowIndex++) {
			for (int columnIndex = 0; columnIndex < columnSize; columnIndex++) {
				array[rowIndex][columnIndex] = rowIndex + columnIndex + 1;
			}
		}
		return array;
	}

	private static int[][] createMatrixInSequenceHorizontally(int rowSize, int columnSize) {
		int[][] array = new int[rowSize][columnSize];
		for (int rowIndex = 0; rowIndex < rowSize; rowIndex++) {
			for (int columnIndex = 0; columnIndex < columnSize; columnIndex++) {
				array[rowIndex][columnIndex] = increment;
				increment++;
			}
		}
		return array;
	}

	private static int[][] createMatrixInSequenceVertically(int rowSize, int columnSize) {
		int[][] array = new int[rowSize][columnSize];
		for (int columnIndex = 0; columnIndex < columnSize; columnIndex++) {
			for (int rowIndex = 0; rowIndex < rowSize; rowIndex++) {
				array[rowIndex][columnIndex] = increment;
				increment++;
			}
		}
		return array;
	}

	public static void printArray(int rowSize, int columnSize, int[][] array) {
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < columnSize; j++) {
				System.out.print("\t " + array[i][j]);
			}
			System.out.println();
		}
	}

}
