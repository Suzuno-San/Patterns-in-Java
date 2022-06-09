package Patterns;

public class Patterns029 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=row;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		for(int i=1+1;i<=row;i++) {
			for(int j=i;j>0;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
