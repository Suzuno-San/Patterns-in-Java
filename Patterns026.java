package Patterns;

public class Patterns026 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=row;i>0;i--) {
			for(int j=1;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
