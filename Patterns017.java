package Patterns;

public class Patterns017 {
	public static void main(String[] args) {
		int row = 5 , count = 0;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				count++;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}
}
