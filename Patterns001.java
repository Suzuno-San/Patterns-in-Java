package Patterns;

public class Patterns001 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) { 				// row
			for(int j=1;j<=i;j++) {				// column
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

