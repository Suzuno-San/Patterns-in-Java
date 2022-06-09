package Patterns;

public class Patterns027 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=row;i>0;i--) {
			for(int j=row;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
