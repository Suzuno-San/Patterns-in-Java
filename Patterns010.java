package Patterns;

public class Patterns010 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=row;i>0;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=row;k++) {
				System.out.printf("%c ", k+64);
			}
			System.out.println();
		}
	}
}

