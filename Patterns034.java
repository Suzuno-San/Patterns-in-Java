package Patterns;

public class Patterns034 {
	public static void main(String[] args) {
		int row = 4;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.printf("%c ",k+64);
			}
			for(int l=i-1;l>0;l--) {
				System.out.printf("%c ",l+64);
			}
			System.out.println();
		}
	}
}
