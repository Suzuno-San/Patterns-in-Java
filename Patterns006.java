package Patterns;

public class Patterns006 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {				// row
			for(int j=1;j<=row-i;j++) {			// space
				System.out.print("  ");			// " " 2 time
			}
			for(int k=1;k<=i;k++) {				// column
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

