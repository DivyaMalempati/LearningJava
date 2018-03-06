
public class DrawingAMaze {
	public static void main(String[] args) {
		int number = 5;
		roundmaze(number);
	}

	private static void roundmaze(int number) {
		rowLeftToRight(number);
		columnTopToBottom(number);
		rowRightToLeft(number - 1);
		columnBottomToTop(number - 1);
	}

	private static void columnBottomToTop(int number) {
		int columnNumber = number;
		System.out.println();
		for (int rowCount = number; rowCount >= 0; rowCount--) {
			for (int columnCount = columnNumber; columnCount > 0; columnCount--) {
				if (columnCount != 0) {
					System.out.print(" ");
				} else {
					System.out.print(" |1 ");
				}

			}
		}
	}

	private static void rowRightToLeft(int number) {
		for (int rowCount = number; rowCount >= 0; rowCount--) {
			System.out.print(" 1-");
		}
	}

	private static void columnTopToBottom(int number) {
		int columnNumber = number;
		System.out.println();
		for (int rowCount = 2; rowCount < number; rowCount++) {
			for (int columnCount = 1; columnCount <= columnNumber; columnCount++) {
				if (columnCount != 5) {
					System.out.print("   ");
				} else {
					System.out.println(" 1|");
				}
			}
		}

	}

	private static void rowLeftToRight(int number) {
		int rowNumber = number;
		for (int rowCount = 0; rowCount < rowNumber; rowCount++) {
			System.out.print("-1 ");
		}
	}
}
