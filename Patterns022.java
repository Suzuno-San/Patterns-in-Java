package Patterns;

public class Patterns022 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			int temp = 1;
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(temp+" ");
				temp = temp * (i-k)/(k);
			}
			System.out.println();
		}
	}
}
