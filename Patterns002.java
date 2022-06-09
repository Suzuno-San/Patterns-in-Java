package Patterns;

public class Patterns002 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {					// row
			for(int j=1;j<=i;j++) {					// column
				System.out.printf("%c ",j+64);		// ASCII "A"start at 65
//				System.out.print((char)(j+64)+" "); or
			}
			System.out.println();
		}
	}
}

