package Patterns;

public class Patterns035 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(i==j) {
					System.out.print(j+" ");
				}
				else {
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
	}
}
