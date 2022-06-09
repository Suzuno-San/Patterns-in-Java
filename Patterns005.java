package Patterns;

public class Patterns005 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.printf("%c ",i+64);
			}
			System.out.println();
		}
	}
}
