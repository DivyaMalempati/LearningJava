public class MazeAgain {
	
	
	public static void main(String[] args) {
		int number = 4;
		int[][] mazeArray = new int[4][4];
		roundMaze(number, mazeArray);
	}

	private static void roundMaze(int number, int[][] mazeArray) {
		int rowStart = 0, rowEnd = number, columnStart = 0, columnEnd = number;
		int[] leftToRight = new int[4];
		rowLeftToRight(rowStart, rowEnd);
		columnTopToBottom(columnStart+1, columnEnd);
		rowRightToLeft(rowStart, rowEnd-1);
		columnBottomToTop(columnStart, columnEnd-1);
	}

	private static void columnBottomToTop(int columnStart, int columnEnd) {
		int[] leftToRightArray = new int[4];
		int j=12;
		for (int i = columnStart+1; i <columnEnd; i++) {
			leftToRightArray[i] = j--;
		}
		for (int i : leftToRightArray) {
			System.out.println(i);
		}
	}

	private static void rowRightToLeft(int rowStart, int rowEnd) {
		int[] leftToRightArray = new int[4];
		int j=10;
		for (int i = rowStart+1; i <=rowEnd; i++) {
			leftToRightArray[i] = j--;
		}
		for (int i : leftToRightArray) {
			System.out.println(i);
		}
	}

	private static void columnTopToBottom(int columnStart, int columnEnd) {
		int[] leftToRightArray = new int[4];
		int j=5;
		for (int i = columnStart; i <columnEnd; i++) {
			leftToRightArray[i] = j++;
		}
		for (int i : leftToRightArray) {
			System.out.println(i);
		}
	}

	private static void rowLeftToRight(int rowStart, int rowEnd) {
		int[] leftToRightArray = new int[4];
		for (int i = rowStart; i <rowEnd; i++) {
			leftToRightArray[i] = i+1;
		}
		for (int i : leftToRightArray) {
			System.out.println(i);
		}
	}
	
}
