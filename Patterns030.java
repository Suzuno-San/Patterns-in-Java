package Patterns;

public class Patterns030 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=row;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.printf("%c ",j+64);
			}
			System.out.println();
		}
		for(int i=1+1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.printf("%c ",j+64);
			}
			System.out.println();
		}
	}
}
