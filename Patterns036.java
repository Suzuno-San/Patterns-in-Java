package Patterns;

public class Patterns036 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print(1+" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.printf(i+" ");
			}
			System.out.println();
		}
	}
}
