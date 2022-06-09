package Patterns;

public class Patterns019 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=row;j>=i;j--) {
				System.out.printf("%c ", j+64);
			}
			System.out.println();
		}
	}
}
