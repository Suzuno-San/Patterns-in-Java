package Patterns;

public class Patterns037 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print("A ");
			}
			for(int k=1;k<=i;k++) {
				System.out.printf("%c ",i+64);
			}
			System.out.println();
		}
	}
}
