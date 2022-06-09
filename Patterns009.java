package Patterns;

public class Patterns009 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.printf("%c ",k+64);
			}
			System.out.println();
		}
	}
}

