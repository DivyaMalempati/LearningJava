import java.util.Scanner;

public class ZTileCreate {
	public static void main(String[] args) {
		int numberTiles;
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter the number of tiles to create Z shaped tile");
		numberTiles=scanner.nextInt();
		for (int i = 0; i < numberTiles; i++) {
			for(int j=0;j<numberTiles;j++) {
				if(i==0 || i==numberTiles-1) {
					System.out.print("1");
				}
				else if(i+j==numberTiles-1) {
					System.out.print("1");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
